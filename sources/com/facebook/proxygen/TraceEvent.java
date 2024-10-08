package com.facebook.proxygen;

import X.002;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.DbS;
import X.DbT;
import java.util.Iterator;
import java.util.Map;

public class TraceEvent extends NativeHandleImpl {
    public final long mEnd;
    public final int mID;
    public final String mName;
    public final int mParentID;
    public final long mStart;

    public native void close();

    public native Map getMetaData();

    public long getEnd() {
        return this.mEnd;
    }

    public int getId() {
        return this.mID;
    }

    public String getName() {
        return this.mName;
    }

    public int getParentID() {
        return this.mParentID;
    }

    public long getStart() {
        return this.mStart;
    }

    public String toPrettyJson() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("{\n  \"name\":\"");
        A1A.append(this.mName);
        A1A.append("\",\n  \"id\":");
        A1A.append(this.mID);
        A1A.append(",\n  \"parentID\":");
        A1A.append(this.mParentID);
        A1A.append(",\n  \"start\":");
        A1A.append(this.mStart);
        A1A.append(",\n  \"end\":");
        A1A.append(this.mEnd);
        stringBuffer.append(AnonymousClass7TF.A0l(",\n  \"metaData\":{\n", A1A));
        Iterator A0u = AnonymousClass7TF.A0u(getMetaData());
        boolean z = true;
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (!z) {
                stringBuffer.append(",\n");
            }
            stringBuffer.append(002.A0g("    \"", DbT.A13(A1J), "\":\""));
            int length = DbS.A0s(A1J).length();
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            String A0s = DbS.A0s(A1J);
            if (length > 100) {
                A1A2.append(A0s.substring(0, 97));
                str = "...\"";
            } else {
                A1A2.append(A0s);
                str = "\"";
            }
            stringBuffer.append(AnonymousClass7TF.A0l(str, A1A2));
            z = false;
        }
        stringBuffer.append("\n  }\n}");
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TraceEvent(name='");
        A1A.append(this.mName);
        A1A.append("', id='");
        A1A.append(this.mID);
        A1A.append("', parentID='");
        A1A.append(this.mParentID);
        A1A.append("', start='");
        A1A.append(this.mStart);
        A1A.append("', end='");
        A1A.append(this.mEnd);
        stringBuffer.append(AnonymousClass7TF.A0l("', metaData='{", A1A));
        Iterator A0u = AnonymousClass7TF.A0u(getMetaData());
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            stringBuffer.append(002.A0u(DbT.A13(A1J), ": ", DbS.A0s(A1J), ", "));
        }
        stringBuffer.append("}')");
        return stringBuffer.toString();
    }

    public TraceEvent(String str) {
        this.mName = str;
        this.mID = 0;
        this.mParentID = 0;
        this.mStart = 0;
        this.mEnd = 0;
    }

    public void finalize() {
        close();
    }

    public TraceEvent(String str, int i, int i2, long j, long j2) {
        this.mName = str;
        this.mID = i;
        this.mParentID = i2;
        this.mStart = j;
        this.mEnd = j2;
    }
}
