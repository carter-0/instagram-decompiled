package com.instagram.video.live.mvvm.viewmodel.composer;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.0sn;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C250973mM;
import X.C310016aI;
import X.C60291Jio;
import X.C60340gF;
import X.C61007Jv6;
import X.C61013JvD;
import X.C63921LDa;
import X.DbY;
import X.DbZ;
import X.Dba;
import X.Dbc;
import X.LM9;
import X.M0V;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.composer.IgLiveComposerViewModel$onPostButtonTapped$1", f = "IgLiveComposerViewModel.kt", i = {0}, l = {300}, m = "invokeSuspend", n = {"broadcastInfo"}, s = {"L$1"})
public final class IgLiveComposerViewModel$onPostButtonTapped$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C60291Jio A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgLiveComposerViewModel$onPostButtonTapped$1(C60291Jio jio, String str, AnonymousClass4D7 r4, int i, long j, boolean z) {
        super(2, r4);
        this.A05 = jio;
        this.A07 = z;
        this.A06 = str;
        this.A04 = j;
        this.A03 = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.video.live.mvvm.viewmodel.composer.IgLiveComposerViewModel$onPostButtonTapped$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        C60291Jio jio = this.A05;
        boolean z = this.A07;
        return new IgLiveComposerViewModel$onPostButtonTapped$1(jio, this.A06, r10, this.A03, this.A04, z);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.video.live.mvvm.viewmodel.composer.IgLiveComposerViewModel$onPostButtonTapped$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        C60291Jio jio;
        C61013JvD jvD;
        C250973mM r7;
        String str;
        Object obj2 = 1Hj.A02;
        if (this.A00 != 0) {
            jvD = (C61013JvD) this.A02;
            jio = (C60291Jio) this.A01;
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            jio = this.A05;
            jvD = (C61013JvD) jio.A09.A06.getValue();
            if (jvD != null) {
                boolean z = this.A07;
                String str2 = this.A06;
                long j = this.A04;
                int i = this.A03;
                if (z) {
                    String str3 = ((C61007Jv6) jio.A0F.getValue()).A01;
                    int length = str3.length() - 1;
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 <= length) {
                        int i3 = length;
                        if (!z2) {
                            i3 = i2;
                        }
                        boolean A13 = Dbc.A13(str3, i3);
                        if (z2) {
                            if (!A13) {
                                break;
                            }
                            length--;
                        } else if (!A13) {
                            z2 = true;
                        } else {
                            i2++;
                        }
                    }
                    str2 = Dba.A0c(str3, length, i2);
                }
                jio.A0F.getValue();
                C60291Jio.A00((M0V) null, jio, "", 3, false, false, false);
                String str4 = jvD.A08;
                if (str4 != null) {
                    IgLiveCommentsRepository igLiveCommentsRepository = jio.A07;
                    LiveUserPaySupportTier liveUserPaySupportTier = jvD.A04;
                    int i4 = jvD.A00;
                    boolean A1S = AnonymousClass7TF.A1S(jvD.A0J ? 1 : 0, 1);
                    long A002 = jio.A0A.A00();
                    this.A01 = jio;
                    this.A02 = jvD;
                    this.A00 = 1;
                    if (igLiveCommentsRepository.A0A(liveUserPaySupportTier, str2, str4, this, i, i4, j, A002, A1S, z) == obj2) {
                        return obj2;
                    }
                }
            }
            return C60340gF.A00;
        }
        C63921LDa lDa = jio.A08;
        if (!(lDa == null || (r7 = lDa.A00) == null)) {
            C310016aI r4 = jio.A04;
            if (r4 != null) {
                UserSession userSession = jio.A03;
                String str5 = jvD.A09;
                long A072 = DbZ.A07(C61013JvD.A00(jvD));
                double A003 = (double) jio.A0A.A00();
                LiveUserPaySupportTier liveUserPaySupportTier2 = jvD.A04;
                if (liveUserPaySupportTier2 != null) {
                    str = liveUserPaySupportTier2.name();
                } else {
                    str = null;
                }
                r4.A05(jio.A02, userSession, r7, (Boolean) null, str5, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, str, (String) null, (String) null, A003, A072);
            } else {
                LM9 lm9 = jio.A06;
                String str6 = jvD.A09;
                String A004 = C61013JvD.A00(jvD);
                String str7 = jvD.A08;
                long A005 = jio.A0A.A00();
                LiveUserPaySupportTier liveUserPaySupportTier3 = jvD.A04;
                0sn r8 = 0sn.A00;
                DbY.A1S(str6, str7);
                0qQ.A0B(r8, 6);
                LM9.A00(liveUserPaySupportTier3, (M0V) null, lm9, str6, A004, str7, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, r8, A005).Cgf();
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgLiveComposerViewModel$onPostButtonTapped$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
