/*
 * Copyright (C) 2010 Ken Ellinwood
 *
 * Changes Copyright (C) 2017 CISPA (https://cispa.saarland), Saarland University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package saarland.cispa.apksigner.security;

import java.io.IOException;

/**
 * Thrown by JKS.engineLoad() for errors that occur after determining the keystore is actually a JKS keystore.
 */
public class LoadKeystoreException extends IOException {

    public LoadKeystoreException() {
    }

    public LoadKeystoreException(String message) {
        super(message);
    }

    public LoadKeystoreException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoadKeystoreException(Throwable cause) {
        super(cause);
    }
}
