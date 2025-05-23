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

package dev.siroshun.serialization.core.key;

import org.jetbrains.annotations.NotNull;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation that tells the serializer/deserializer to use the specified key.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.RECORD_COMPONENT
})
public @interface Key {

    /**
     * A {@link String} to use as a key in the serializer/deserializer
     *
     * @return a {@link String} to use as a key in the serializer/deserializer
     */
    @NotNull String value() default "";

}
