package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import java.util.List;

/* renamed from: X.7da  reason: invalid class name and case insensitive filesystem */
public final class C335817da extends 0Yg implements 0sP {
    public final /* synthetic */ MediaCommentListRepository A00;
    public final /* synthetic */ C335777dW A01;
    public final /* synthetic */ C334157al A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C335817da(MediaCommentListRepository mediaCommentListRepository, C335777dW r3, C334157al r4, boolean z, boolean z2) {
        super(1);
        this.A03 = z;
        this.A02 = r4;
        this.A00 = mediaCommentListRepository;
        this.A01 = r3;
        this.A04 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C247733gp r5;
        1Xl r4 = (1Xl) obj;
        0qQ.A0B(r4, 0);
        if (this.A03 && this.A02 == C334157al.INITIAL_LOADING) {
            r4.BPf().A0d.A0B.A01();
        }
        1E5 A002 = 1E4.A00(this.A00.A0B);
        1Xj BPf = r4.BPf();
        C335777dW r2 = this.A01;
        List A012 = C335827db.A01(A002, r2.A0D);
        List A013 = C335827db.A01(A002, r2.A0E);
        1bK r0 = r2.A02;
        if (r0 != null) {
            C335827db.A00(A002, r0);
        }
        int i = r2.A01;
        boolean z = r2.A0G;
        boolean z2 = this.A04;
        C334157al r6 = this.A02;
        String str = r2.A0B;
        String str2 = r2.A0C;
        boolean z3 = r2.A0J;
        1bK r02 = r2.A03;
        if (r02 != null) {
            r5 = C335827db.A00(A002, r02);
        } else {
            r5 = null;
        }
        BPf.A41(r5, r6, r2.A09, str, str2, A012, A013, i, z, z2, false, z3);
        return C60340gF.A00;
    }
}
