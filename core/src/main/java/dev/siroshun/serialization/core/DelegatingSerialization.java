/*
 *     Copyright 2025 Siroshun09
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package dev.siroshun.serialization.core;

import org.jetbrains.annotations.NotNull;

record DelegatingSerialization<T, S>(Serializer<? super T, ? extends S> serializer,
                                     Deserializer<? super S, ? extends T> deserializer) implements Serialization<T, S> {

    @Override
    public boolean hasSerializer() {
        return this.serializer != null;
    }

    @Override
    public @NotNull Serializer<? super T, ? extends S> serializer() {
        if (this.serializer == null) {
            throw new IllegalStateException("This serialization does not have a serializer.");
        }

        return this.serializer;
    }

    @Override
    public boolean hasDeserializer() {
        return this.deserializer != null;
    }

    @Override
    public @NotNull Deserializer<? super S, ? extends T> deserializer() {
        if (this.deserializer == null) {
            throw new IllegalStateException("This serialization does not have a deserializer.");
        }

        return this.deserializer;
    }
}
