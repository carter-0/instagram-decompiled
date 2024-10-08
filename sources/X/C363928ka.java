package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.gallery.Medium;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.8ka  reason: invalid class name and case insensitive filesystem */
public final class C363928ka implements Comparable {
    public int A00;
    public long A01;
    public C365758nd A02;
    public C352218Cl A03;
    public C349307zv A04;
    public String A05;

    public static void A00(Exception exc, String str) {
        0f9 AEf = 0wj.A01.AEf("CapturedMediaRecentsInfo", 817895516);
        AEf.ABQ(DialogModule.KEY_MESSAGE, str);
        AEf.ERJ(exc);
        AEf.report();
    }

    public final Medium A01() {
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            C352218Cl r0 = this.A03;
            r0.getClass();
            return r0.A0F;
        } else if (ordinal == 1) {
            C349307zv r02 = this.A04;
            r02.getClass();
            return r02.A0R;
        } else {
            throw new IllegalArgumentException("Invalid media type to get medium from.");
        }
    }

    public final String A02() {
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            C352218Cl r0 = this.A03;
            r0.getClass();
            return r0.A06();
        } else if (ordinal == 1) {
            C349307zv r02 = this.A04;
            r02.getClass();
            return r02.A0k;
        } else {
            throw new IllegalArgumentException("Invalid media type to load thumbnail for.");
        }
    }

    public final boolean A03() {
        Object obj;
        if (this.A02 == C365758nd.A07) {
            obj = this.A04;
        } else {
            obj = this.A03;
        }
        if (obj == null || !new File(A02()).exists()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (this.A01 > ((C363928ka) obj).A01 ? 1 : (this.A01 == ((C363928ka) obj).A01 ? 0 : -1));
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (!(obj instanceof C363928ka)) {
            return false;
        }
        C363928ka r4 = (C363928ka) obj;
        C365758nd r1 = this.A02;
        if (!r1.equals(r4.A02)) {
            return false;
        }
        if (r1 == C365758nd.A07) {
            obj2 = this.A04;
            obj3 = r4.A04;
        } else {
            obj2 = this.A03;
            obj3 = r4.A03;
        }
        return 2Ob.A00(obj2, obj3);
    }

    public final int hashCode() {
        Object obj;
        if (this.A02 == C365758nd.A07) {
            obj = this.A04;
        } else {
            obj = this.A03;
        }
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public C363928ka(C352218Cl r6) {
        this.A02 = C365758nd.A04;
        this.A03 = r6;
        long j = r6.A0B;
        this.A01 = j <= 0 ? r6.A0A : j;
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            C363938kb.A00(A0A, r6);
            A0A.close();
            this.A05 = stringWriter.toString();
        } catch (IOException e) {
            A00(e, "Failed to process photo");
        }
    }

    public C363928ka(C349307zv r3) {
        this.A02 = C365758nd.A07;
        this.A04 = r3;
        this.A01 = r3.A0M;
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            C369998vf.A00(A0A, r3);
            A0A.close();
            this.A05 = stringWriter.toString();
        } catch (IOException e) {
            A00(e, "Failed to process video in ctor");
        }
    }

    public C363928ka() {
    }
}
