package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.H4y  reason: case insensitive filesystem */
public final class C54255H4y extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C54255H4y(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A03 = obj4;
        this.A01 = obj2;
        this.A02 = obj;
        this.A04 = obj3;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str3;
    }

    public final void onFail(C268654dm r3) {
        if (1 - this.A00 != 0) {
            C54255H4y.super.onFail(r3);
            return;
        }
        int A032 = AnonymousClass0fD.A03(869340104);
        ((1P0) this.A02).onFail(r3);
        AnonymousClass0fD.A0A(-1098702584, A032);
    }

    public final void onFailInBackground(C268654dm r7) {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(1930518596);
            ((1P0) this.A02).onFailInBackground(r7);
            i = -1514645937;
        } else {
            A032 = AnonymousClass0fD.A03(-1296633521);
            C63988LHg.A00((FragmentActivity) this.A01, (UserSession) this.A03, this.A06, this.A05, this.A07);
            i = -1065493071;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onFinish() {
        if (1 - this.A00 != 0) {
            C54255H4y.super.onFinish();
            return;
        }
        int A032 = AnonymousClass0fD.A03(1484967812);
        ((1P0) this.A02).onFinish();
        AnonymousClass0fD.A0A(-1395272722, A032);
    }

    public final void onStart() {
        if (1 - this.A00 != 0) {
            C54255H4y.super.onStart();
            return;
        }
        int A032 = AnonymousClass0fD.A03(-673843709);
        ((1P0) this.A02).onStart();
        AnonymousClass0fD.A0A(-1604745580, A032);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.instagram.save.model.SavedCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.instagram.save.model.SavedCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.instagram.save.model.SavedCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: com.instagram.save.model.SavedCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.instagram.save.model.SavedCollection} */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        if (r6 != null) goto L_0x00a0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x000a
            X.C54255H4y.super.onSuccess(r15)
            return
        L_0x000a:
            r0 = -848057379(0xffffffffcd73abdd, float:-2.5550792E8)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 749155589(0x2ca73505, float:4.752312E-12)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r14.A02
            X.1P0 r0 = (X.1P0) r0
            r0.onSuccess(r15)
            java.lang.Object r5 = r14.A04
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.IOk r8 = X.C55124HcX.A00(r5)
            java.lang.String r0 = r14.A07
            if (r0 == 0) goto L_0x003d
            X.1Xj r10 = X.DbV.A0U(r5, r0)
        L_0x002f:
            java.lang.String r12 = r14.A05
            java.lang.String r13 = r14.A06
            r11 = 0
            java.lang.Object r9 = r14.A03
            com.instagram.api.schemas.CollectionPrivacyModeEnum r9 = (com.instagram.api.schemas.CollectionPrivacyModeEnum) r9
            r8.A03(r9, r10, r11, r12, r13)
            monitor-enter(r8)
            goto L_0x003f
        L_0x003d:
            r10 = 0
            goto L_0x002f
        L_0x003f:
            r4 = 0
            X.0qQ.A0B(r12, r4)     // Catch:{ all -> 0x00d7 }
            boolean r0 = r8.A05     // Catch:{ all -> 0x00d7 }
            r6 = 0
            if (r0 == 0) goto L_0x0067
            java.util.LinkedList r0 = r8.A00     // Catch:{ all -> 0x00d7 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x00d7 }
        L_0x004e:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x0064
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x00d7 }
            r0 = r1
            com.instagram.save.model.SavedCollection r0 = (com.instagram.save.model.SavedCollection) r0     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = r0.A0F     // Catch:{ all -> 0x00d7 }
            boolean r0 = X.0qQ.A0K(r0, r12)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x004e
            r6 = r1
        L_0x0064:
            com.instagram.save.model.SavedCollection r6 = (com.instagram.save.model.SavedCollection) r6     // Catch:{ all -> 0x00d7 }
            goto L_0x009c
        L_0x0067:
            java.util.concurrent.ConcurrentHashMap r0 = r8.A03     // Catch:{ all -> 0x00d7 }
            java.lang.Object r1 = r0.get(r12)     // Catch:{ all -> 0x00d7 }
            X.HMw r1 = (X.C54665HMw) r1     // Catch:{ all -> 0x00d7 }
            if (r1 == 0) goto L_0x009c
            java.util.concurrent.ConcurrentHashMap r0 = r8.A04     // Catch:{ all -> 0x00d7 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x00d7 }
            X.HzT r1 = (X.C56497HzT) r1     // Catch:{ all -> 0x00d7 }
            if (r1 == 0) goto L_0x009c
            monitor-enter(r1)     // Catch:{ all -> 0x00d7 }
            java.util.LinkedList r0 = r1.A00     // Catch:{ all -> 0x0099 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d7 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00d7 }
        L_0x0083:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x009c
            java.lang.Object r7 = r1.next()     // Catch:{ all -> 0x00d7 }
            com.instagram.save.model.SavedCollection r7 = (com.instagram.save.model.SavedCollection) r7     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = r7.A0F     // Catch:{ all -> 0x00d7 }
            boolean r0 = X.0qQ.A0K(r0, r12)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x0083
            monitor-exit(r8)
            goto L_0x00a0
        L_0x0099:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d7 }
            throw r0     // Catch:{ all -> 0x00d7 }
        L_0x009c:
            monitor-exit(r8)
            r7 = r6
            if (r6 == 0) goto L_0x00ca
        L_0x00a0:
            java.lang.Object r6 = r14.A01
            X.0iw r6 = (X.AnonymousClass0iw) r6
            X.0wc r1 = X.DbT.A0Q(r6, r5, r4)
            java.lang.String r0 = "ig_collections"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x00ca
            X.C51969G9p.A19(r4, r6)
            java.lang.String r1 = "collection_save_edits"
            java.lang.String r0 = "event"
            java.lang.String r1 = X.C51975G9x.A0g(r4, r7, r0, r1)
            java.lang.String r0 = "collection_type"
            X.C51973G9u.A14(r4, r0, r1)
            X.I35.A02(r4, r5, r7)
            r4.Cgf()
        L_0x00ca:
            r0 = -269304450(0xffffffffeff2bd7e, float:-1.5024891E29)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1090853820(0x41051bbc, float:8.319271)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54255H4y.onSuccess(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        r8 = (com.instagram.common.session.UserSession) r9.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            if (r0 == 0) goto L_0x0026
            r0 = 1818944268(0x6c6ae30c, float:1.13584336E27)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r0 = -1137136027(0xffffffffbc38ae65, float:-0.011272048)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r9.A02
            X.1P0 r0 = (X.1P0) r0
            r0.onSuccessInBackground(r10)
            r0 = 1486905736(0x58a06188, float:1.41072603E15)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1556488841(0x5cc62289, float:4.46160138E17)
        L_0x0022:
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x0026:
            r0 = 1230861163(0x495d736b, float:907062.7)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.3JC r10 = (X.AnonymousClass3JC) r10
            r0 = 183170544(0xaeaf5f0, float:2.2625892E-32)
            int r5 = X.AnonymousClass7TG.A0D(r10, r0)
            java.lang.Object r2 = r10.A01
            X.JsO r2 = (X.C60855JsO) r2
            r4 = 0
            if (r2 == 0) goto L_0x0093
            java.lang.Object r8 = r9.A03
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            r1 = 10
            r0 = 1774(0x6ee, float:2.486E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.instagram.model.reels.Reel r3 = X.C63098KrR.A00(r8, r2, r0, r1)
            if (r3 == 0) goto L_0x0093
            java.lang.Object r7 = r9.A01
            androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
            java.lang.Object r0 = r9.A02
            android.content.Context r0 = (android.content.Context) r0
            X.GSp r1 = new X.GSp
            r1.<init>(r0, r7)
            r0 = 3
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0qQ.A0C(r7, r0)
            r0 = r7
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.32A r2 = new X.32A
            r2.<init>(r0, r8, r1)
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r2.A0C = r0
            java.lang.Object r1 = r9.A04
            X.LHg r1 = (X.C63988LHg) r1
            X.HDP r0 = new X.HDP
            r0.<init>(r7, r1)
            r2.A05 = r0
            X.IWp r0 = new X.IWp
            r0.<init>(r7, r1)
            r2.A06 = r0
            X.3BQ r0 = X.AnonymousClass3BQ.DEEPLINK
            r2.A03(r3, r0, r4)
        L_0x0089:
            r0 = 1126968998(0x432c2ea6, float:172.18222)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1825902683(0x6cd5105b, float:2.0606275E27)
            goto L_0x0022
        L_0x0093:
            java.lang.Object r4 = r9.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r9.A01
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.String r2 = r9.A06
            java.lang.String r1 = r9.A05
            java.lang.String r0 = r9.A07
            X.C63988LHg.A00(r3, r4, r2, r1, r0)
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54255H4y.onSuccessInBackground(java.lang.Object):void");
    }
}
