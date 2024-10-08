package X;

import java.io.File;
import java.util.List;

/* renamed from: X.Sra  reason: case insensitive filesystem */
public final class C12328Sra implements C13834Ti9 {
    public C10939S1u A00;
    public C13834Ti9 A01;

    public final void D0g(SJL sjl) {
        C13834Ti9 ti9 = this.A01;
        if (ti9 != null) {
            ti9.D0g(sjl);
        }
    }

    public final void D5E(List list) {
        C10939S1u s1u = this.A00;
        if (s1u != null) {
            C13886Tj9 tj9 = s1u.A01;
            C9596Rda.A00(tj9, (Exception) null, "media_upload_process_success", s1u.A02, C13886Tj9.A00(tj9, s1u.A00));
        }
        C13834Ti9 ti9 = this.A01;
        if (ti9 != null) {
            ti9.D5E(list);
        }
    }

    public final /* bridge */ /* synthetic */ void DDE(SJL sjl, Object obj) {
        Exception exc;
        Exception exc2 = (Exception) obj;
        C10939S1u s1u = this.A00;
        if (s1u != null) {
            if (exc2 instanceof AnonymousClass4ZS) {
                exc = exc2;
            } else {
                exc = new Exception(002.A0g("Failed to resize video (", exc2.getMessage(), ")"), exc2);
            }
            s1u.A00(exc);
        }
        C13834Ti9 ti9 = this.A01;
        if (ti9 != null) {
            ti9.DDE(sjl, exc2);
        }
    }

    public final void DaK(double d) {
        C13834Ti9 ti9 = this.A01;
        if (ti9 != null) {
            ti9.DaK(d);
        }
    }

    public final void DiY(File file, long j) {
        C13834Ti9 ti9 = this.A01;
        if (ti9 != null) {
            ti9.DiY(file, j);
        }
    }

    public final void Dia(SRW srw) {
        C13834Ti9 ti9 = this.A01;
        if (ti9 != null) {
            ti9.Dia(srw);
        }
    }

    public final void onStart() {
        C10939S1u s1u = this.A00;
        if (s1u != null) {
            C13886Tj9 tj9 = s1u.A01;
            s1u.A00 = tj9.now();
            C9596Rda.A00(tj9, (Exception) null, "media_upload_process_start", s1u.A02, -1);
        }
        C13834Ti9 ti9 = this.A01;
        if (ti9 != null) {
            ti9.onStart();
        }
    }
}
