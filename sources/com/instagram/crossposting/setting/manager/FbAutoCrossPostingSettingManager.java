package com.instagram.crossposting.setting.manager;

import X.0Aj;
import X.0Tu;
import X.0eO;
import X.0qQ;
import X.0wc;
import X.16V;
import X.182;
import X.AnonymousClass0HM;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0t1;
import X.AnonymousClass8k0;
import X.AnonymousClass9L5;
import X.AnonymousClass9PN;
import X.B29;
import X.C363028iv;
import X.C363278jS;
import X.C363568jx;
import X.C363588jz;
import X.C40439AcA;
import X.N4R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

public final class FbAutoCrossPostingSettingManager {
    public static final C363028iv Companion = new Object();
    public final AnonymousClass0eM accountType$delegate;
    public final AnonymousClass0eM bplCrossPostingSettingDataProvider$delegate;
    public final AnonymousClass0eM bplCrossPostingSettingMutator$delegate;
    public final AnonymousClass0eM logger$delegate;
    public final AnonymousClass0eM unifiedConfigCrossPostingSettingDataProvider$delegate;
    public final AnonymousClass0eM unifiedConfigCrossPostingSettingMutator$delegate;
    public final UserSession userSession;

    public FbAutoCrossPostingSettingManager(UserSession userSession2) {
        0qQ.A0B(userSession2, 1);
        this.userSession = userSession2;
        0eO r2 = 0eO.A02;
        this.accountType$delegate = AnonymousClass0eN.A00(r2, new AnonymousClass9L5(this, 43));
        this.unifiedConfigCrossPostingSettingDataProvider$delegate = AnonymousClass0eN.A00(r2, new AnonymousClass9L5(this, 47));
        this.bplCrossPostingSettingDataProvider$delegate = AnonymousClass0eN.A00(r2, new AnonymousClass9L5(this, 44));
        this.unifiedConfigCrossPostingSettingMutator$delegate = AnonymousClass0eN.A00(r2, new AnonymousClass9L5(this, 48));
        this.bplCrossPostingSettingMutator$delegate = AnonymousClass0eN.A00(r2, new AnonymousClass9L5(this, 45));
        this.logger$delegate = AnonymousClass0eN.A00(r2, new AnonymousClass9L5(this, 46));
    }

    public static final FbAutoCrossPostingSettingManager getInstance(UserSession userSession2) {
        return C363028iv.A00(userSession2);
    }

    public void updateAutoCrossPostingSetting(N4R n4r, AnonymousClass8k0 r10) {
        0qQ.A0B(n4r, 0);
        String obj = AnonymousClass0HM.A00().toString();
        0qQ.A07(obj);
        B29 mutator = getMutator();
        C363568jx logger = getLogger();
        String identifier = mutator.getIdentifier();
        0wc r2 = (0wc) logger.A01.getValue();
        0Aj A00 = r2.A00(r2.A00, "cxp_ig_client_sourced_creation");
        16V A0J = AnonymousClass0t1.A01.A01(logger.A00).A0J();
        if (A0J == null) {
            A0J = 16V.A08;
        }
        A00.AAJ(AnonymousClass9PN.A01(), obj);
        A00.AAJ(TraceFieldType.AdhocEventName, "xposting_setting_mutate_attempt");
        A00.AAJ("data_source", identifier);
        A00.AAJ("source_account_type", A0J.A01);
        A00.Cgf();
        mutator.FJh(n4r, new C40439AcA(r10, mutator, this, obj));
    }

    private final 16V getAccountType() {
        return (16V) this.accountType$delegate.getValue();
    }

    private final C363278jS getBplCrossPostingSettingDataProvider() {
        return (C363278jS) this.bplCrossPostingSettingDataProvider$delegate.getValue();
    }

    private final B29 getBplCrossPostingSettingMutator() {
        return (B29) this.bplCrossPostingSettingMutator$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final C363568jx getLogger() {
        return (C363568jx) this.logger$delegate.getValue();
    }

    private final C363278jS getUnifiedConfigCrossPostingSettingDataProvider() {
        return (C363278jS) this.unifiedConfigCrossPostingSettingDataProvider$delegate.getValue();
    }

    private final B29 getUnifiedConfigCrossPostingSettingMutator() {
        return (B29) this.unifiedConfigCrossPostingSettingMutator$delegate.getValue();
    }

    public boolean isCrossPostingSettingsPlatformizationReadEnabled() {
        return Boolean.valueOf(182.A06(0Tu.A05, this.userSession, 36325944331351434L)).booleanValue();
    }

    public boolean isCrossPostingSettingsPlatformizationWriteEnabled() {
        return Boolean.valueOf(182.A06(0Tu.A05, this.userSession, 36325944331416971L)).booleanValue();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.8jS, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (X.C363038ix.A00(r1) == X.AnonymousClass05K.A01) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (X.C363038ix.A02(r4.userSession) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C363278jS getDataProvider() {
        /*
            r4 = this;
            X.16V r0 = r4.getAccountType()
            if (r0 == 0) goto L_0x004a
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0020
            r0 = 1
            if (r1 == r0) goto L_0x0045
            r0 = 3
            if (r1 != r0) goto L_0x004a
            com.instagram.common.session.UserSession r0 = r4.userSession
            boolean r0 = X.C363038ix.A02(r0)
            if (r0 == 0) goto L_0x0045
        L_0x001b:
            X.8jS r0 = r4.getBplCrossPostingSettingDataProvider()
            return r0
        L_0x0020:
            com.instagram.common.session.UserSession r3 = r4.userSession
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326799029843939(0x810f08000037e3, double:3.0365522105274937E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x001b
            com.instagram.common.session.UserSession r1 = r4.userSession
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Integer r1 = X.C363038ix.A00(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x001b
        L_0x0045:
            X.8jS r0 = r4.getUnifiedConfigCrossPostingSettingDataProvider()
            return r0
        L_0x004a:
            X.AcB r0 = new X.AcB
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager.getDataProvider():X.8jS");
    }

    public boolean getFeedAutoCrossPostingSettingOn() {
        return getDataProvider().B56();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.B29] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (X.C363038ix.A00(r1) == X.AnonymousClass05K.A01) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (X.C363038ix.A02(r4.userSession) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.B29 getMutator() {
        /*
            r4 = this;
            X.16V r0 = r4.getAccountType()
            if (r0 == 0) goto L_0x004a
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0020
            r0 = 1
            if (r1 == r0) goto L_0x0045
            r0 = 3
            if (r1 != r0) goto L_0x004a
            com.instagram.common.session.UserSession r0 = r4.userSession
            boolean r0 = X.C363038ix.A02(r0)
            if (r0 == 0) goto L_0x0045
        L_0x001b:
            X.B29 r0 = r4.getBplCrossPostingSettingMutator()
            return r0
        L_0x0020:
            com.instagram.common.session.UserSession r3 = r4.userSession
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326799029843939(0x810f08000037e3, double:3.0365522105274937E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x001b
            com.instagram.common.session.UserSession r1 = r4.userSession
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Integer r1 = X.C363038ix.A00(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x001b
        L_0x0045:
            X.B29 r0 = r4.getUnifiedConfigCrossPostingSettingMutator()
            return r0
        L_0x004a:
            X.AcC r0 = new X.AcC
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager.getMutator():X.B29");
    }

    public boolean getReelsAutoCrossPostingSettingOn() {
        return getDataProvider().Bl3();
    }

    public boolean getStoryAutoCrossPostingSettingOn() {
        return getDataProvider().C0A();
    }

    public void refreshAutoCrossPostingSettings(AnonymousClass8k0 r9) {
        String obj = AnonymousClass0HM.A00().toString();
        0qQ.A07(obj);
        C363278jS dataProvider = getDataProvider();
        C363568jx logger = getLogger();
        String identifier = dataProvider.getIdentifier();
        0wc r2 = (0wc) logger.A01.getValue();
        0Aj A00 = r2.A00(r2.A00, "cxp_ig_client_sourced_creation");
        16V A0J = AnonymousClass0t1.A01.A01(logger.A00).A0J();
        if (A0J == null) {
            A0J = 16V.A08;
        }
        A00.AAJ(AnonymousClass9PN.A02(9, 10, 41), obj);
        A00.AAJ(TraceFieldType.AdhocEventName, "xposting_setting_fetch_attempt");
        A00.AAJ("data_source", identifier);
        A00.AAJ("source_account_type", A0J.A01);
        A00.Cgf();
        dataProvider.EBB(new C363588jz(r9, dataProvider, this, obj));
    }
}
