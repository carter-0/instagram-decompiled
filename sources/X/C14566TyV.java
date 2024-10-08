package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.TyV  reason: case insensitive filesystem */
public final class C14566TyV extends C308096Sr {
    public final /* synthetic */ AnonymousClass3M6 A00;
    public final /* synthetic */ C307786Rm A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14566TyV(AnonymousClass3M6 r1, C307786Rm r2, long j) {
        super(j);
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object A00(Context context, View view, Object obj, Object obj2) {
        AnonymousClass3M6 r1;
        C276544tV A07 = ((C276544tV) obj).A07(36);
        WJr wJr = (WJr) obj2;
        if (A07 == null || (r1 = this.A00) == null) {
            return null;
        }
        r1.DTY(wJr, this.A01, A07);
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2, Object obj3, Object obj4) {
        C276544tV A07 = ((C276544tV) obj).A07(36);
        C276544tV A072 = ((C276544tV) obj2).A07(36);
        if (A07 == A072) {
            return false;
        }
        if (A07 != null) {
            return !A07.equals(A072);
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
