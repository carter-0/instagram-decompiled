package org.webrtc;

import X.002;
import X.AnonymousClass000;
import X.AnonymousClass7TE;

public class StatsReport {
    public final String id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    public class Value {
        public final String name;
        public final String value;

        public String toString() {
            return 002.A11("[", this.name, ": ", this.value, "]");
        }

        public Value(String str, String str2) {
            this.name = str;
            this.value = str2;
        }
    }

    public StatsReport(String str, String str2, double d, Value[] valueArr) {
        this.id = str;
        this.type = str2;
        this.timestamp = d;
        this.values = valueArr;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("id: ");
        A1A.append(this.id);
        A1A.append(AnonymousClass000.A00(2051));
        A1A.append(this.type);
        A1A.append(", timestamp: ");
        A1A.append(this.timestamp);
        A1A.append(", values: ");
        int i = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i >= valueArr.length) {
                return A1A.toString();
            }
            A1A.append(valueArr[i].toString());
            A1A.append(", ");
            i++;
        }
    }
}
