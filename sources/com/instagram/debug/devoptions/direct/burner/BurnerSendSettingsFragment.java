package com.instagram.debug.devoptions.direct.burner;

import X.0qQ;
import X.2da;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C227642jf;
import X.C47518E6c;
import X.C66580MXl;
import X.C66583MXo;
import X.C67293MlS;
import X.C71277OhI;
import X.DbS;
import X.DbU;
import X.DbW;
import X.FGF;
import X.PR9;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BurnerSendSettingsFragment extends C47518E6c implements AnonymousClass4DS {
    public static final int $stable = 8;
    public static final Companion Companion = new Object();
    public static final String MODULE_NAME = "burner_send_settings_fragment";
    public final String moduleName = "burner_send_settings_fragment";
    public BurnerSendSettingsConfig sendSettingsConfig;
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r3 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C50989Fmc createMultiChoiceMenuItem(java.lang.CharSequence r13, java.lang.String[] r14, java.lang.Object[] r15, int r16, java.lang.Object r17, X.0sP r18) {
        /*
            r12 = this;
            r8 = r15
            int r2 = r15.length
            r1 = 0
        L_0x0003:
            r4 = 0
            r6 = r14
            r7 = r18
            if (r1 >= r2) goto L_0x0017
            r0 = r15[r1]
            r3 = r17
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x004e
            r3 = r14[r1]
            if (r3 != 0) goto L_0x001e
        L_0x0017:
            r0 = r15[r16]
            r3 = r14[r16]
            r7.invoke(r0)
        L_0x001e:
            r5 = r12
            android.content.Context r2 = r12.requireContext()
            r10 = r13
            java.lang.StringBuilder r1 = X.JTQ.A0d(r13)
            java.lang.String r0 = " : "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r3, r1)
            X.Fmc r9 = new X.Fmc
            r9.<init>((android.content.Context) r2, (android.view.View.OnClickListener) r4, (java.lang.CharSequence) r0)
            X.3Ar r0 = r12.getScrollingViewProxy()
            X.2rL r11 = r0.AZK()
            boolean r0 = r11 instanceof X.C68504NKx
            if (r0 == 0) goto L_0x004c
            X.NKx r11 = (X.C68504NKx) r11
        L_0x0044:
            com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment$createMultiChoiceMenuItem$onClickListener$1 r4 = new com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment$createMultiChoiceMenuItem$onClickListener$1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r9.A05 = r4
            return r9
        L_0x004c:
            r11 = r4
            goto L_0x0044
        L_0x004e:
            int r1 = r1 + 1
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment.createMultiChoiceMenuItem(java.lang.CharSequence, java.lang.String[], java.lang.Object[], int, java.lang.Object, X.0sP):X.Fmc");
    }

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, "Burner Bulk Send");
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        ArrayList A1C = AnonymousClass7TE.A1C();
        FGF.A01(A1C, 2131957859);
        A1C.add(new PR9((CompoundButton.OnCheckedChangeListener) new BurnerSendSettingsFragment$onViewCreated$1(this), 2131957856, true));
        String A0m = DbU.A0m(this, 2131957860);
        BurnerSendSettingsFragment$onViewCreated$targetUserIdEditText$1 burnerSendSettingsFragment$onViewCreated$targetUserIdEditText$1 = new BurnerSendSettingsFragment$onViewCreated$targetUserIdEditText$1(this);
        BurnerSendSettingsFragment$onViewCreated$targetUserIdEditText$2 burnerSendSettingsFragment$onViewCreated$targetUserIdEditText$2 = BurnerSendSettingsFragment$onViewCreated$targetUserIdEditText$2.INSTANCE;
        Integer A0q = C66580MXl.A0q();
        C71277OhI ohI = new C71277OhI(burnerSendSettingsFragment$onViewCreated$targetUserIdEditText$2, burnerSendSettingsFragment$onViewCreated$targetUserIdEditText$1, A0q, A0m, "", false);
        A1C.add(new C67293MlS(C66583MXo.A07(this, ohI, A1C), (View.OnClickListener) new BurnerSendSettingsFragment$onViewCreated$2(this, ohI, A1C), "Select User"));
        A1C.add(new C71277OhI(BurnerSendSettingsFragment$onViewCreated$messageCountEditText$2.INSTANCE, new BurnerSendSettingsFragment$onViewCreated$messageCountEditText$1(this), A0q, DbU.A0m(this, 2131957857), "", false));
        String A0m2 = DbU.A0m(this, 2131957858);
        ArrayList A0v = DbS.A0v(r4);
        for (BurnerSendSettingsConfig.MessageType name : BurnerSendSettingsConfig.MessageType.values()) {
            A0v.add(name.name());
        }
        A1C.add(new C67293MlS(C66583MXo.A07(this, createMultiChoiceMenuItem(A0m2, (String[]) A0v.toArray(new String[0]), BurnerSendSettingsConfig.MessageType.values(), 1, BurnerSendSettingsConfig.MessageType.TEXT, new BurnerSendSettingsFragment$onViewCreated$4(this)), A1C), (View.OnClickListener) new BurnerSendSettingsFragment$onViewCreated$5(this), "Send"));
        setItems(A1C);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(148861934);
        super.onCreate(bundle);
        this.sendSettingsConfig = new BurnerSendSettingsConfig("", 1, true, BurnerSendSettingsConfig.MessageType.TEXT, (String) null);
        AnonymousClass0fD.A09(2058880026, A02);
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
