package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.Av4  reason: case insensitive filesystem */
public final class C41503Av4 implements 02o {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass88B A02;
    public final /* synthetic */ boolean A03;

    public C41503Av4(Context context, UserSession userSession, AnonymousClass88B r3, boolean z) {
        this.A03 = z;
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r6) {
        AnonymousClass2Fj r1;
        AnonymousClass88C r0;
        C361278fx r5 = (C361278fx) obj;
        int i = r5.A00;
        if (i == 3) {
            boolean z = this.A03;
            AnonymousClass88B r3 = this.A02;
            File file = (File) r5.A00();
            if (z) {
                r3.A01(this.A00, this.A01, file);
            } else {
                r3.A01 = file;
                r1 = r3.A06;
                r0 = AnonymousClass88C.SUCCESS;
                r1.A0B(r0);
            }
        } else {
            AnonymousClass88B r12 = this.A02;
            r12.A01 = null;
            r1 = r12.A06;
            if (i == 0) {
                r0 = AnonymousClass88C.UNSET;
            } else if (i != 1) {
                r0 = AnonymousClass88C.FAILURE;
            } else {
                r0 = AnonymousClass88C.DOWNLOADING;
            }
            r1.A0B(r0);
        }
        return C60340gF.A00;
    }
}
