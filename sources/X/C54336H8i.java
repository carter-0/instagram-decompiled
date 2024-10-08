package X;

import com.instagram.api.schemas.CommentRestrictStatus;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.H8i  reason: case insensitive filesystem */
public final class C54336H8i extends C235042zB {
    public final C55915Hpc A00;
    public final 0wc A01;
    public final Set A02 = AnonymousClass7TE.A1F();
    public final /* synthetic */ C55802Hni A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54336H8i(C55802Hni hni, 0wc r3, long j) {
        super(j);
        this.A03 = hni;
        this.A01 = r3;
        this.A00 = new C55915Hpc(r3);
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        String str;
        String str2;
        1Xj BPf;
        1Xj BPf2;
        C247733gp r6 = (C247733gp) obj;
        0qQ.A0B(r6, 0);
        if (!r6.A03() && r6.A06 == C252883pr.Success) {
            Set set = this.A02;
            if (!set.contains(r6.A0G) && (str = r6.A0G) != null && str.length() != 0) {
                set.add(str);
                C269874fp r1 = r6.A0W;
                if (!(r1 == null || (BPf = r1.BPf()) == null || !BPf.A5G() || (BPf2 = r1.BPf()) == null)) {
                    this.A00.A00(BPf2);
                }
                if (CommentRestrictStatus.PENDING == r6.A0U) {
                    0wc r2 = this.A01;
                    HashMap A0q = DbZ.A0q();
                    0Aj A0e = AnonymousClass7TE.A0e(r2, C273654mx.A00(2856));
                    DbS.A1J(A0e, "impression");
                    DbS.A1H(A0e, "pending_comment");
                    C51969G9p.A1F(A0e, "entrypoint", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, A0q);
                    Long A002 = AnonymousClass73V.A00(DbX.A0r(r6.A08));
                    if (A002 != null) {
                        A0e.A9F(C273654mx.A00(230), A002);
                    }
                    Long A003 = AnonymousClass73V.A00(r6.A0G);
                    if (A003 != null) {
                        A0e.A9F("comment_id", A003);
                    }
                    Long A004 = AnonymousClass73V.A00(r6.A0F);
                    if (A004 != null) {
                        A0e.A9F("parent_comment_id", A004);
                    }
                    1Xj r0 = r6.A07;
                    if (r0 != null) {
                        str2 = r0.A30();
                    } else {
                        str2 = null;
                    }
                    Long A005 = AnonymousClass73V.A00(str2);
                    if (A005 != null) {
                        A0e.A9F("parent_media_id", A005);
                    }
                    A0e.Cgf();
                }
            }
        }
    }
}
