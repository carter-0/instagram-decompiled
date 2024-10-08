package org.webrtc;

import X.002;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41845B3m;
import java.util.List;

public class MediaConstraints {
    public final List mandatory = AnonymousClass7TE.A1C();
    public final List optional = AnonymousClass7TE.A1C();

    public class KeyValuePair {
        public final String key;
        public final String value;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                KeyValuePair keyValuePair = (KeyValuePair) obj;
                if (!this.key.equals(keyValuePair.key) || !this.value.equals(keyValuePair.value)) {
                    return false;
                }
            }
            return true;
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return C41845B3m.A01(this.value, this.key.hashCode());
        }

        public String toString() {
            return 002.A0g(this.key, ": ", this.value);
        }

        public KeyValuePair(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    public static String stringifyKeyValuePairList(List list) {
        StringBuilder sb = new StringBuilder("[");
        for (Object next : list) {
            if (sb.length() > 1) {
                sb.append(", ");
            }
            sb.append(next.toString());
        }
        return AnonymousClass7TF.A0l("]", sb);
    }

    public List getMandatory() {
        return this.mandatory;
    }

    public List getOptional() {
        return this.optional;
    }

    public String toString() {
        return 002.A0u("mandatory: ", stringifyKeyValuePairList(this.mandatory), ", optional: ", stringifyKeyValuePairList(this.optional));
    }
}
