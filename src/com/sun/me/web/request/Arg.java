/*
Copyright (c) 2007, Sun Microsystems, Inc.

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

public final class Arg {

	// some commonly used HTTP header names
	public static final String AUTHORIZATION = "Authorization";
	public static final String USER_AGENT = "User-Agent";

	public static final String CONTENT_LENGTH = "Content-Length";
	public static final String CONTENT_TYPE = "Content-Type";
	public static final String CONTENT_DISPOSITION = "Content-Disposition";
	public static final String CONTENT_TRANSFER_ENCODING = "Content-Transfer-Encoding";

	public static final String LAST_MODIFIED = "Last-Modified";
	public static final String IF_MODIFIED_SINCE = "If-Modified-Since";

	public static final String ETAG = "ETag";
	public static final String IF_NONE_MATCH = "If-None-Match";

	// some commonly used HTTP header values.
	public static final String CONTENT_TYPE_WWW_FORM_URL_ENCODED = "application/x-www-form-urlencoded";

	private final String key;
	private final String value;

	// value is allowed to be null
	public Arg(final String k, final String v) {
		if (k == null || "".equals(k)) {
			throw new IllegalArgumentException("invalid key");
		}
		key = k;
		value = v;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public int hashCode() {
		// TODO: not sure if value should be included
		return value == null ? key.hashCode() : key.hashCode()
				^ value.hashCode();
	}

	public boolean equals(final Object other) {
		if (other instanceof Arg) {
			final Arg oa = ((Arg) other);
			// TODO: not sure if value should be included
			return value == null ? key.equals(oa.key) : key.equals(oa.key)
					&& value.equals(oa.value);
		}
		return false;
	}
}
