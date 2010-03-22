/*
Copyright (c) 2000-2007, Sun Microsystems, Inc.
 
All rights reserved.
 
Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:
 
 * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer in
      the documentation and/or other materials provided with the
      distribution.
 * Neither the name of Sun Microsystems, Inc. nor the names of its
      contributors may be used to endorse or promote products derived
      from this software without specific prior written permission.
 
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package com.sun.me.web.request;

import org.bouncycastle.util.encoders.Base64;


/**
 * This class encodes a user name and password
 * in the format (base 64) that HTTP Basic
 * Authorization requires.
 *
 * @see http://java.sun.com/docs/books/j2mewireless/examples/src/examples/netclient/BasicAuth.java
 */

public class BasicAuth {
    // make sure no one can instantiate this class
    private BasicAuth() {}

    // conversion table
    private static byte[] cvtTable = {
        (byte)'A', (byte)'B', (byte)'C', (byte)'D', (byte)'E',
        (byte)'F', (byte)'G', (byte)'H', (byte)'I', (byte)'J',
        (byte)'K', (byte)'L', (byte)'M', (byte)'N', (byte)'O',
        (byte)'P', (byte)'Q', (byte)'R', (byte)'S', (byte)'T',
        (byte)'U', (byte)'V', (byte)'W', (byte)'X', (byte)'Y',
        (byte)'Z',
        (byte)'a', (byte)'b', (byte)'c', (byte)'d', (byte)'e',
        (byte)'f', (byte)'g', (byte)'h', (byte)'i', (byte)'j',
        (byte)'k', (byte)'l', (byte)'m', (byte)'n', (byte)'o',
        (byte)'p', (byte)'q', (byte)'r', (byte)'s', (byte)'t',
        (byte)'u', (byte)'v', (byte)'w', (byte)'x', (byte)'y',
        (byte)'z',
        (byte)'0', (byte)'1', (byte)'2', (byte)'3', (byte)'4',
        (byte)'5', (byte)'6', (byte)'7', (byte)'8', (byte)'9',
        (byte)'+', (byte)'/'
    };

    /**
     * Encode a name/password pair appropriate to
     * use in an HTTP header for Basic Authentication.
     *    name     the user's name
     *    passwd   the user's password
     *    returns  String   the base64 encoded name:password
     */
    public static String encode(String name,
                         String passwd) {
        byte input[] = (name + ":" + passwd).getBytes();
        byte[] output = Base64.encode(input);
        return new String(output);
    }
}

