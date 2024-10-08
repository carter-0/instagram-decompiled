package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.appreciation.graphql.FetchAppreciationCreatorInsightsQueryResponseImpl;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JTc  reason: case insensitive filesystem */
public final class C59672JTc extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public boolean A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59672JTc(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A02 = i;
        this.A03 = obj;
        this.A00 = obj2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, X.JTc] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.JTc] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.4D7, X.JTc] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r3 = new X.C59672JTc(r2, r1, r11, r0);
        r3.A01 = X.AnonymousClass7TE.A1a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        return new X.C59672JTc(r4, r5, r6, r7, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            int r0 = r9.A02
            r6 = r11
            switch(r0) {
                case 0: goto L_0x002b;
                case 1: goto L_0x0013;
                case 2: goto L_0x0039;
                case 3: goto L_0x001b;
                case 4: goto L_0x003f;
                case 5: goto L_0x0023;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r4 = r9.A03
            java.lang.Object r5 = r9.A00
            boolean r8 = r9.A01
            r7 = 6
        L_0x000d:
            X.JTc r3 = new X.JTc
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x0013:
            java.lang.Object r4 = r9.A03
            boolean r8 = r9.A01
            java.lang.Object r5 = r9.A00
            r7 = 1
            goto L_0x000d
        L_0x001b:
            java.lang.Object r5 = r9.A00
            boolean r8 = r9.A01
            java.lang.Object r4 = r9.A03
            r7 = 3
            goto L_0x000d
        L_0x0023:
            java.lang.Object r4 = r9.A03
            java.lang.Object r5 = r9.A00
            boolean r8 = r9.A01
            r7 = 5
            goto L_0x000d
        L_0x002b:
            java.lang.Object r1 = r9.A03
            X.LAZ r1 = (X.LAZ) r1
            boolean r0 = r9.A01
            X.JTc r3 = new X.JTc
            r3.<init>(r1, r11, r0)
            r3.A00 = r10
            return r3
        L_0x0039:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A00
            r0 = 2
            goto L_0x0044
        L_0x003f:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A00
            r0 = 4
        L_0x0044:
            X.JTc r3 = new X.JTc
            r3.<init>(r2, r1, r11, r0)
            boolean r0 = X.AnonymousClass7TE.A1a(r10)
            r3.A01 = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59672JTc.create(java.lang.Object, X.4D7):X.4D7");
    }

    public final Object invokeSuspend(Object obj) {
        C250663lr r8;
        0sn r7;
        Collection collection;
        ArrayList arrayList;
        FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.LifetimeEstimatedEarnings lifetimeEstimatedEarnings;
        C250663lr A04;
        ImmutableList requiredCompactedTreeListField;
        ImmutableList optionalCompactedTreeListField;
        String optionalStringField;
        Integer A0l;
        C250663lr optionalTreeField;
        Object value;
        AnonymousClass62P A002;
        boolean z;
        boolean z2;
        C66386MPs mPs;
        Object value2;
        C61084JwM jwM;
        switch (this.A02) {
            case 0:
                0eS.A00(obj);
                LAZ laz = (LAZ) this.A03;
                C254573sh r0 = C250663lr.Companion;
                C250663lr optionalTreeField2 = ((C250663lr) this.A00).getOptionalTreeField(0, "viewer", FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.class, 317146606);
                if (optionalTreeField2 == null || (optionalTreeField = optionalTreeField2.getOptionalTreeField(0, PublicKeyCredentialControllerUtility.JSON_KEY_USER, FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.class, -507660251)) == null) {
                    r8 = null;
                } else {
                    r8 = optionalTreeField.getOptionalTreeField(0, AnonymousClass000.A00(569), FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.class, -1737055912);
                }
                if (this.A01) {
                    if (!(r8 == null || (optionalCompactedTreeListField = r8.getOptionalCompactedTreeListField(1, AnonymousClass000.A00(4120), FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.TopEarningContent.class, -962291286)) == null)) {
                        r7 = AnonymousClass7TE.A1C();
                        Iterator it = optionalCompactedTreeListField.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.TopEarningContent.Media A0E = ((FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.TopEarningContent) next).A0E();
                            if (A0E != null) {
                                FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.TopEarningContent.Media.MediaGiftEarnings mediaGiftEarnings = (FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.TopEarningContent.Media.MediaGiftEarnings) A0E.getOptionalTreeField(3, AnonymousClass000.A00(696), FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.TopEarningContent.Media.MediaGiftEarnings.class, 1942040202);
                                if (!(mediaGiftEarnings == null || (optionalStringField = mediaGiftEarnings.getOptionalStringField(1, "amount_with_offset")) == null || (A0l = 00y.A0l(optionalStringField)) == null || A0l.intValue() <= 0)) {
                                    r7.add(next);
                                }
                            }
                        }
                    }
                    r7 = 0sn.A00;
                } else {
                    MQ0 mq0 = (MQ0) laz.A03.getValue();
                    if (C59678JTj.A03(mq0)) {
                        r7 = (List) ((C61074JwC) ((C59678JTj) mq0).A01).A00;
                    }
                    r7 = 0sn.A00;
                }
                MQ0 mq02 = (MQ0) laz.A03.getValue();
                if (C59678JTj.A01(1, mq02)) {
                    collection = (Collection) ((C61074JwC) ((C59678JTj) mq02).A01).A02;
                } else {
                    collection = 0sn.A00;
                }
                FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.PageInfo pageInfo = null;
                if (r8 == null || (A04 = r8.A04(FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.class, AnonymousClass000.A00(1604), -1275275814)) == null || (requiredCompactedTreeListField = A04.getRequiredCompactedTreeListField(0, "edges", FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.Edges.class, -1186689805)) == null) {
                    arrayList = 0sn.A00;
                } else {
                    arrayList = AnonymousClass7TE.A1C();
                    Iterator it2 = requiredCompactedTreeListField.iterator();
                    while (it2.hasNext()) {
                        C250663lr optionalTreeField3 = ((C250663lr) it2.next()).getOptionalTreeField(0, "node", FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.Edges.Node.class, 1191000141);
                        if (optionalTreeField3 != null) {
                            arrayList.add(optionalTreeField3);
                        }
                    }
                }
                ArrayList A0S = 00k.A0S(arrayList, collection);
                if (r8 != null) {
                    lifetimeEstimatedEarnings = (FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.LifetimeEstimatedEarnings) r8.getOptionalTreeField(0, AnonymousClass000.A00(690), FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.LifetimeEstimatedEarnings.class, 2086930639);
                    C250663lr A042 = r8.A04(FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.class, AnonymousClass000.A00(1604), -1275275814);
                    if (A042 != null) {
                        pageInfo = (FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.PageInfo) A042.getOptionalTreeField(1, "page_info", FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.PageInfo.class, -2144576818);
                    }
                } else {
                    lifetimeEstimatedEarnings = null;
                }
                return new C61074JwC(lifetimeEstimatedEarnings, pageInfo, (List) r7, (List) A0S);
            case 1:
                0eS.A00(obj);
                C60103Jfj jfj = (C60103Jfj) this.A03;
                05G r2 = jfj.A05;
                boolean z3 = this.A01;
                AnonymousClass3PC r1 = (AnonymousClass3PC) this.A00;
                do {
                    value = r2.getValue();
                    C59964JcX jcX = (C59964JcX) value;
                    A002 = C60103Jfj.A00(jfj, 00k.A0U(r1.A00.values()), z3);
                    z = jcX.A04;
                    z2 = jcX.A03;
                    mPs = (C66386MPs) jcX.A01;
                    0qQ.A0B(mPs, 3);
                    0qQ.A0B(A002, 4);
                } while (!r2.AIY(value, new C59964JcX(mPs, A002, z, z3, z2)));
                break;
            case 2:
                0eS.A00(obj);
                boolean z4 = this.A01;
                MVZ mvz = (MVZ) this.A00;
                ((C52516GVt) this.A03).A00.A01(mvz.B6I(), mvz.BLP(), mvz.getItemCount() - 1, !z4);
                break;
            case 3:
                0eS.A00(obj);
                User user = (User) this.A00;
                user.A14(this.A01);
                AnonymousClass1Nd.A00(((KWS) this.A03).A00).A00(new C2370736f(user, false, false, true, false));
                break;
            case 4:
                0eS.A00(obj);
                if (!this.A01) {
                    05G r4 = ((C60136JgH) this.A03).A01;
                    QP8 qp8 = (QP8) this.A00;
                    do {
                        value2 = r4.getValue();
                        jwM = (C61084JwM) value2;
                    } while (!r4.AIY(value2, C61084JwM.A01(qp8, (List) jwM.A02, (List) jwM.A01)));
                    break;
                }
                break;
            case 5:
                0eS.A00(obj);
                1UN.A02((1UN) this.A03, (C228552lr) this.A00, this.A01);
                break;
            default:
                0eS.A00(obj);
                C2597042t r12 = (C2597042t) this.A03;
                1XK r02 = r12.A02;
                UserSession userSession = r12.A01;
                byte[] bArr = (byte[]) this.A00;
                boolean z5 = this.A01;
                AnonymousClass7TG.A1N(userSession, bArr);
                r02.A00.A05.A0G(userSession, bArr, 4, z5);
                break;
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C59672JTc) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59672JTc(LAZ laz, AnonymousClass4D7 r3, boolean z) {
        super(2, r3);
        this.A02 = 0;
        this.A03 = laz;
        this.A01 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59672JTc(Object obj, Object obj2, AnonymousClass4D7 r4, int i, boolean z) {
        super(2, r4);
        this.A02 = i;
        this.A03 = obj;
        this.A01 = z;
        this.A00 = obj2;
    }
}
