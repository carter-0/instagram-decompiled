package X;

import android.os.Parcelable;
import com.facebook.pando.Summary;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;

public final class FTQ implements 2IR {
    public static final /* synthetic */ AnonymousClass0YZ[] A0A = {new 01B(FTQ.class, "view", "getView()Lcom/instagram/profile/fragment/UserDetailRequestCallback$UserDetailView;", 0)};
    public int A00;
    public int A01;
    public boolean A02;
    public final 1E6 A03;
    public final UserSession A04;
    public final Dda A05;
    public final C323066wt A06;
    public final G5K A07;
    public final boolean A08;
    public final 0w6 A09;

    public FTQ(1E6 r4, UserSession userSession, C267604bt r6, Dda dda, C323066wt r8, G5K g5k) {
        0qQ.A0B(r4, 4);
        this.A07 = g5k;
        this.A06 = r8;
        this.A03 = r4;
        this.A04 = userSession;
        this.A05 = dda;
        this.A08 = 182.A06(0Tu.A05, userSession, 36316388029829421L);
        this.A09 = new C51618Fx7(new WeakReference(r6), 0);
    }

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("UserDetailDeferStreamingRequestGraphQLCallback.onFailure", 764794429);
        }
        try {
            11Z.A02(new C51397FtT(this, th));
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1682648010);
            }
        }
    }

    public static final C267604bt A00(FTQ ftq) {
        return (C267604bt) ftq.A09.CDM(ftq, A0A[0]);
    }

    /* JADX WARNING: type inference failed for: r5v12, types: [com.facebook.pando.TreeJNI, X.9pa] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        AnonymousClass3JC r3;
        boolean z;
        C250663lr r5;
        C298925uG r52;
        User user;
        String A0c;
        AnonymousClass3JD r14 = (AnonymousClass3JD) obj;
        if (Systrace.A0E(1)) {
            0fS.A01("UserDetailDeferStreamingRequestGraphQLCallback.onSuccess", -1477180052);
        }
        try {
            Dda dda = this.A05;
            dda.A0E(002.A0c("fetch_user_on_data_flush", "_bg", this.A00));
            C3727892k r2 = null;
            if ((r14 instanceof AnonymousClass3JC) && (r3 = (AnonymousClass3JC) r14) != null) {
                Summary summary = r3.A00;
                long j = summary.requestStartTime;
                if (j > 0) {
                    dda.A0H("fetch_user_request_start", j);
                }
                long j2 = summary.networkStartTime;
                if (j2 > 0) {
                    dda.A0H("fetch_user_network_start", j2);
                }
                long j3 = summary.networkEndTime;
                if (j3 > 0) {
                    int i2 = this.A00;
                    if (i2 == 0) {
                        A0c = "fetch_user_network_end";
                    } else {
                        A0c = 002.A0c("fetch_user_network_flush", "_end", i2);
                    }
                    dda.A0H(A0c, j3);
                }
                long j4 = summary.networkResponseStartTime;
                if (j4 > 0) {
                    dda.A0H("fetch_user_network_response_start", j4);
                }
                long j5 = summary.parseStartTime;
                if (j5 > 0) {
                    dda.A0H(002.A0c("fetch_user_parse_flush", "_start", this.A00), j5);
                }
                long j6 = summary.parseEndTime;
                if (j6 > 0) {
                    dda.A0H(002.A0c("fetch_user_parse_flush", "_end", this.A00), j6);
                }
                C250673ls r7 = (C250673ls) r3.A01;
                if (r7 instanceof C2G) {
                    z = false;
                    r5 = (C2F) ((C2G) r7).getRequiredTreeField(0, AnonymousClass000.A00(826), C2F.class, 958712321);
                } else if (r7 instanceof C2E) {
                    z = false;
                    r5 = (C2D) ((C2E) r7).getRequiredTreeField(0, AnonymousClass000.A00(4226), C2D.class, 851208549);
                } else {
                    r2 = null;
                }
                C2Q c2q = (C2Q) r5.reinterpretRequired(z ? 1 : 0, C2Q.class, -294452885);
                0qQ.A0A(c2q);
                dda.A0E(002.A0c("graphql_model_conversion_flush", "_start", this.A00));
                boolean A062 = 182.A06(0Tu.A05, this.A04, 36316388029763884L);
                1E6 r9 = this.A03;
                if (A062) {
                    ? r53 = (C389419pa) c2q.reinterpret(C389419pa.class);
                    1E9 r8 = new 1E9(r9, AnonymousClass7TE.A1F(), z);
                    ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) r53.getTreeValueByHashCode(3599307, ImmutablePandoUserDict.class);
                    if (immutablePandoUserDict != null) {
                        Parcelable.Creator creator = User.CREATOR;
                        user = 1aC.A01(r8, immutablePandoUserDict);
                    } else {
                        user = null;
                    }
                    r53.A00 = user;
                    r52 = r53;
                } else {
                    r52 = ((C389419pa) c2q.reinterpret(C389419pa.class)).A0q(new 1E9(r9, AnonymousClass7TE.A1F(), z));
                }
                0qQ.A0A(r52);
                dda.A0E(002.A0c("graphql_model_conversion_flush", "_end", this.A00));
                r2 = new C3727892k();
                r2.A02 = r52;
                r2.mStatus = "ok";
                r2.EQG(r3.AjP());
                r2.EQE(r3.AjJ());
            }
            this.A00++;
            if (r2 != null) {
                11Z.A02(new C51480Fuo(r14, r2, this));
                if (Systrace.A0E(1)) {
                    i = 2034957721;
                } else {
                    return;
                }
            } else if (Systrace.A0E(1)) {
                i = 461142977;
            } else {
                return;
            }
            0fS.A00(i);
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(-690668211);
            }
            throw th;
        }
    }
}
