package com.instagram.debug.devoptions.sandboxselector;

import X.0qQ;
import X.AnonymousClass7TG;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class DevserverListError {

    public final class ConnectionError extends DevserverListError {
        public static final ConnectionError INSTANCE = new Object();
    }

    public final class HttpError extends DevserverListError {
        public final String errorMessage;
        public final int statusCode;

        public final int component1() {
            return this.statusCode;
        }

        public final String component2() {
            return this.errorMessage;
        }

        public final HttpError copy(int i, String str) {
            return new HttpError(i, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof HttpError) {
                    HttpError httpError = (HttpError) obj;
                    if (this.statusCode != httpError.statusCode || !0qQ.A0K(this.errorMessage, httpError.errorMessage)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ HttpError copy$default(HttpError httpError, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = httpError.statusCode;
            }
            if ((i2 & 2) != 0) {
                str = httpError.errorMessage;
            }
            return new HttpError(i, str);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            return (this.statusCode * 31) + AnonymousClass7TG.A0E(this.errorMessage);
        }

        public HttpError(int i, String str) {
            this.statusCode = i;
            this.errorMessage = str;
        }
    }

    public DevserverListError() {
    }

    public /* synthetic */ DevserverListError(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
