package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class H0U extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AddFactFragment";
    public final String A00 = "add_fact_fragment";
    public final AnonymousClass0eM A01 = C58702IwB.A00(this, 49);
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final AnonymousClass0eM A09 = AnonymousClass1YB.A00(C58706IwF.A01(this, 0));

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (r4.A04.getValue() == null) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.0eM r3 = r4.A05
            java.lang.Object r0 = r3.getValue()
            java.lang.String r1 = "SINGULAR_FACT"
            boolean r0 = X.0qQ.A0K(r0, r1)
            r2 = 1
            if (r0 == 0) goto L_0x0029
            X.0eM r0 = r4.A06
            java.lang.String r0 = X.DbS.A0t(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0029
            r1 = 2131956929(0x7f1314c1, float:1.9550428E38)
        L_0x0022:
            r5.Eom(r1)
            r5.Eu4(r2)
            return
        L_0x0029:
            java.lang.Object r0 = r3.getValue()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0043
            X.0eM r0 = r4.A06
            java.lang.String r0 = X.DbS.A0t(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0043
            r1 = 2131956931(0x7f1314c3, float:1.9550432E38)
            goto L_0x0022
        L_0x0043:
            java.lang.Object r1 = r3.getValue()
            java.lang.String r0 = "QUESTION_AND_ANSWER"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x005b
            X.0eM r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x005b
            r1 = 2131956932(0x7f1314c4, float:1.9550434E38)
            goto L_0x0022
        L_0x005b:
            java.lang.Object r0 = r3.getValue()
            java.lang.String r1 = "AFFILIATE_LINKS"
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0073
            X.0eM r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0073
            r1 = 2131956939(0x7f1314cb, float:1.9550448E38)
            goto L_0x0022
        L_0x0073:
            java.lang.Object r0 = r3.getValue()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0088
            X.0eM r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            r1 = 2131956982(0x7f1314f6, float:1.9550535E38)
            if (r0 != 0) goto L_0x0022
        L_0x0088:
            r1 = 2131956930(0x7f1314c2, float:1.955043E38)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H0U.configureActionBar(X.2da):void");
    }

    public final String getModuleName() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public H0U() {
        0eO r5 = 0eO.A02;
        this.A07 = AnonymousClass0eN.A00(r5, new C58719IwS("", this, C66579MXk.A00(116), 42));
        this.A06 = AnonymousClass0eN.A00(r5, new C58719IwS("", this, C66579MXk.A00(282), 43));
        this.A04 = AnonymousClass0eN.A00(r5, new C51671FyX(this));
        this.A05 = AnonymousClass0eN.A00(r5, new C58719IwS("QUESTION_AND_ANSWER", this, "creator_ai_add_fact_content_type", 44));
        this.A02 = C51975G9x.A0r(this, "creator_ai_creator_fbid", r5, 41);
        this.A03 = C51975G9x.A0r(this, "creator_ai_entry_point_extra", r5, 42);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.instagram.creator.agent.settings.facts.viewmodel.QuestionAnswerFactPreviewUseCaseImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.instagram.creator.agent.settings.facts.viewmodel.LinkPreviewUseCaseImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.instagram.creator.agent.settings.facts.viewmodel.SingularFactPreviewUseCaseImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: com.instagram.creator.agent.settings.facts.viewmodel.LinkPreviewUseCaseImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: com.instagram.creator.agent.settings.facts.viewmodel.LinkPreviewUseCaseImpl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = 1647299384(0x622fcb38, float:8.107059E20)
            int r6 = X.AnonymousClass0fD.A02(r0)
            X.H0U.super.onCreate(r13)
            android.os.Bundle r1 = r12.mArguments
            r11 = 0
            if (r1 == 0) goto L_0x00b4
            r0 = 284(0x11c, float:3.98E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r10 = r1.getString(r0)
        L_0x0019:
            android.os.Bundle r1 = r12.mArguments
            if (r1 == 0) goto L_0x00b1
            r0 = 283(0x11b, float:3.97E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r5 = r1.getString(r0)
        L_0x0027:
            android.os.Bundle r1 = r12.mArguments
            if (r1 == 0) goto L_0x0035
            r0 = 115(0x73, float:1.61E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r11 = r1.getString(r0)
        L_0x0035:
            X.0eM r0 = r12.A09
            java.lang.Object r4 = r0.getValue()
            X.H2d r4 = (X.C54183H2d) r4
            X.0eM r0 = r12.A04
            java.lang.String r9 = X.DbS.A0t(r0)
            X.0eM r0 = r12.A07
            java.lang.String r8 = X.DbS.A0t(r0)
            X.0eM r0 = r12.A06
            java.lang.String r7 = X.DbS.A0t(r0)
            X.0eM r0 = r12.A03
            java.lang.String r3 = X.DbS.A0t(r0)
            X.AnonymousClass7TG.A1R(r8, r7)
            X.H2V r2 = r4.A00
            X.05G r1 = r2.A05
            X.Glh r0 = r2.A04
            r1.Epw(r0)
            r2.A05(r8, r7)
            r2.A02 = r9
            r2.A01 = r3
            if (r10 == 0) goto L_0x0078
            if (r11 == 0) goto L_0x0078
            if (r5 != 0) goto L_0x0070
            java.lang.String r5 = ""
        L_0x0070:
            r1 = 7
            X.Jvb r0 = new X.Jvb
            r0.<init>(r11, r5, r10, r1)
            r2.A00 = r0
        L_0x0078:
            X.H2Q r5 = r4.A02
            boolean r0 = r5 instanceof com.instagram.creator.agent.settings.facts.viewmodel.SingularFactPreviewUseCaseImpl
            if (r0 == 0) goto L_0x009b
            com.instagram.creator.agent.settings.facts.viewmodel.SingularFactPreviewUseCaseImpl r5 = (com.instagram.creator.agent.settings.facts.viewmodel.SingularFactPreviewUseCaseImpl) r5
            r4 = 0
            r5.A00 = r9
            X.05G r3 = r5.A02
            boolean r2 = r5.A04
        L_0x0087:
            r1 = 14
            X.Gn3 r0 = new X.Gn3
            r0.<init>(r4, r1, r2)
        L_0x008e:
            r3.Epw(r0)
            r5.A06(r8, r7)
            r0 = 1130467418(0x4361905a, float:225.56387)
            X.AnonymousClass0fD.A09(r0, r6)
            return
        L_0x009b:
            boolean r0 = r5 instanceof com.instagram.creator.agent.settings.facts.viewmodel.QuestionAnswerFactPreviewUseCaseImpl
            if (r0 == 0) goto L_0x00a8
            com.instagram.creator.agent.settings.facts.viewmodel.QuestionAnswerFactPreviewUseCaseImpl r5 = (com.instagram.creator.agent.settings.facts.viewmodel.QuestionAnswerFactPreviewUseCaseImpl) r5
            r4 = 0
            r5.A00 = r9
            X.05G r3 = r5.A02
            r2 = 1
            goto L_0x0087
        L_0x00a8:
            com.instagram.creator.agent.settings.facts.viewmodel.LinkPreviewUseCaseImpl r5 = (com.instagram.creator.agent.settings.facts.viewmodel.LinkPreviewUseCaseImpl) r5
            r5.A00 = r9
            X.05G r3 = r5.A03
            X.Gn3 r0 = r5.A01
            goto L_0x008e
        L_0x00b1:
            r5 = r11
            goto L_0x0027
        L_0x00b4:
            r10 = r11
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H0U.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-704108039);
        ComposeView A0H = DbV.A0H(this, new JGD(DbS.A04(0Tu.A05, DbT.A0X(this.A08), 36604468665717818L), 3, this), -404630534);
        AnonymousClass0fD.A09(-693761345, A022);
        return A0H;
    }
}
