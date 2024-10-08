package X;

import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.io.Writer;
import java.util.List;

/* renamed from: X.3nu  reason: invalid class name and case insensitive filesystem */
public final class C251933nu implements C251893nq {
    public final C251593nM A00;
    public final List A01;
    public volatile boolean A02;

    public final boolean CXo() {
        return true;
    }

    public final int B2C() {
        List list = this.A01;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C251883np) list.get(i2)).A00();
        }
        return i + 256;
    }

    public final boolean CK4() {
        return this.A02;
    }

    public final void Cm1() {
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C251883np) list.get(i)).Cm1();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void FO1(Writer writer) {
        if (!this.A02) {
            List list = this.A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C251883np) list.get(i)).A04();
            }
            this.A02 = true;
        }
        char c = 2;
        writer.write(123);
        writer.write("\"batches\":[");
        List list2 = this.A01;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C251883np r1 = (C251883np) list2.get(i2);
            if (c != 2) {
                writer.write(44);
            } else {
                c = 3;
            }
            if (!r1.CK4()) {
                r1.A04();
            }
            r1.A05(writer);
            writer.write(93);
            writer.write(125);
            writer.flush();
        }
        C251593nM r2 = this.A00;
        writer.write("],");
        0Df A022 = r2.A02.A02();
        try {
            r2.A01.A00(A022.A0B("request_info"));
            C251613nO r22 = r2.A00;
            if (r22 != null) {
                0Df A0B = A022.A0B("config");
                SamplingPolicyConfig samplingPolicyConfig = r22.A00;
                samplingPolicyConfig.E4m(A0B);
                samplingPolicyConfig.E56(A0B);
            }
            0Dd.A00().A05(A022, writer);
            A022.A02();
            writer.write(125);
        } catch (Throwable th) {
            A022.A02();
            throw th;
        }
    }

    public final void unlock() {
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C251883np) list.get(i)).unlock();
        }
        this.A02 = false;
    }

    public C251933nu(C251593nM r3, List list) {
        if (!list.isEmpty()) {
            this.A01 = list;
            this.A00 = r3;
            return;
        }
        throw new IllegalArgumentException("payloads cannot be empty");
    }
}
