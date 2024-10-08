package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ixq  reason: case insensitive filesystem */
public final class C58805Ixq extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C66920MfE A02;
    public final /* synthetic */ C333817aC A03;
    public final /* synthetic */ C333777a7 A04;
    public final /* synthetic */ C52971GgO A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ AnonymousClass62P A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58805Ixq(Context context, C66920MfE mfE, C333817aC r4, C333777a7 r5, C52971GgO ggO, UserSession userSession, AnonymousClass62P r8, long j) {
        super(1);
        this.A07 = r8;
        this.A00 = j;
        this.A01 = context;
        this.A04 = r5;
        this.A06 = userSession;
        this.A05 = ggO;
        this.A03 = r4;
        this.A02 = mfE;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        I11 i11 = (I11) obj;
        0qQ.A0B(i11, 0);
        0sK r1 = C55319Hfm.A00;
        String A002 = AnonymousClass000.A00(2922);
        i11.A01(A002, A002, A002, r1);
        AnonymousClass62P r11 = this.A07;
        i11.A02("comment_rows", J1S.A00, J1T.A00, AnonymousClass5PI.A03(new JK4(0, this.A01, this.A04, this.A06, this.A05, r11), -647845517), r11);
        i11.A01("constant_loading_item_comment_list_key", "constant_loading_item_comment_list_key", "constant_loading_item_comment_list_key", AnonymousClass5PI.A03(new JJU(24, this.A03, this.A02), -623217534));
        long j = this.A00;
        if (j != 9205357640488583168L) {
            i11.A01("constant_cta_comment_row_list_key", "constant_cta_comment_row_list_key", "constant_cta_comment_row_list_key", AnonymousClass5PI.A03(new JGU(j, 0), -1208809306));
        }
        return C60340gF.A00;
    }
}
