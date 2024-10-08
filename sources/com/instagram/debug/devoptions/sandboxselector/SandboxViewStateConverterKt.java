package com.instagram.debug.devoptions.sandboxselector;

import X.01N;
import X.0jo;
import X.0sP;
import X.0sn;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C358618bC;
import X.C46448DfA;
import X.C51974G9v;
import X.C62320sa;
import X.C67293MlS;
import X.C69349Njo;
import X.DbV;
import X.FGF;
import X.JTS;
import X.OIM;
import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.debug.devoptions.sandboxselector.IgServerHealth;
import com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public abstract class SandboxViewStateConverterKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|35) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|35) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0027 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0045 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x004a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x004f */
        static {
            /*
                com.instagram.debug.devoptions.sandboxselector.CorpnetStatus[] r0 = com.instagram.debug.devoptions.sandboxselector.CorpnetStatus.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                r5 = 1
                com.instagram.debug.devoptions.sandboxselector.CorpnetStatus r0 = com.instagram.debug.devoptions.sandboxselector.CorpnetStatus.CHECKING     // Catch:{ NoSuchFieldError -> 0x000d }
                X.C66583MXo.A1K(r0, r1, r5)     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r4 = 2
                com.instagram.debug.devoptions.sandboxselector.CorpnetStatus r0 = com.instagram.debug.devoptions.sandboxselector.CorpnetStatus.ON_CORPNET     // Catch:{ NoSuchFieldError -> 0x0013 }
                X.C66583MXo.A1K(r0, r1, r4)     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                r3 = 3
                com.instagram.debug.devoptions.sandboxselector.CorpnetStatus r0 = com.instagram.debug.devoptions.sandboxselector.CorpnetStatus.OFF_CORPNET     // Catch:{ NoSuchFieldError -> 0x0019 }
                X.C66583MXo.A1K(r0, r1, r3)     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r1
                com.instagram.debug.devoptions.sandboxselector.SandboxType[] r0 = com.instagram.debug.devoptions.sandboxselector.SandboxType.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.instagram.debug.devoptions.sandboxselector.SandboxType r0 = com.instagram.debug.devoptions.sandboxselector.SandboxType.PRODUCTION     // Catch:{ NoSuchFieldError -> 0x0027 }
                X.C66583MXo.A1K(r0, r1, r5)     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                com.instagram.debug.devoptions.sandboxselector.SandboxType r0 = com.instagram.debug.devoptions.sandboxselector.SandboxType.DEDICATED     // Catch:{ NoSuchFieldError -> 0x002c }
                X.C66583MXo.A1K(r0, r1, r4)     // Catch:{ NoSuchFieldError -> 0x002c }
            L_0x002c:
                com.instagram.debug.devoptions.sandboxselector.SandboxType r0 = com.instagram.debug.devoptions.sandboxselector.SandboxType.ON_DEMAND     // Catch:{ NoSuchFieldError -> 0x0031 }
                X.C66583MXo.A1K(r0, r1, r3)     // Catch:{ NoSuchFieldError -> 0x0031 }
            L_0x0031:
                r2 = 4
                com.instagram.debug.devoptions.sandboxselector.SandboxType r0 = com.instagram.debug.devoptions.sandboxselector.SandboxType.OTHER     // Catch:{ NoSuchFieldError -> 0x0037 }
                X.C66583MXo.A1K(r0, r1, r2)     // Catch:{ NoSuchFieldError -> 0x0037 }
            L_0x0037:
                $EnumSwitchMapping$1 = r1
                com.instagram.debug.devoptions.sandboxselector.IgServerHealth$Unhealthy$UnhealthyReason[] r0 = com.instagram.debug.devoptions.sandboxselector.IgServerHealth.Unhealthy.UnhealthyReason.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.instagram.debug.devoptions.sandboxselector.IgServerHealth$Unhealthy$UnhealthyReason r0 = com.instagram.debug.devoptions.sandboxselector.IgServerHealth.Unhealthy.UnhealthyReason.BAD_GATEWAY     // Catch:{ NoSuchFieldError -> 0x0045 }
                X.C66583MXo.A1K(r0, r1, r5)     // Catch:{ NoSuchFieldError -> 0x0045 }
            L_0x0045:
                com.instagram.debug.devoptions.sandboxselector.IgServerHealth$Unhealthy$UnhealthyReason r0 = com.instagram.debug.devoptions.sandboxselector.IgServerHealth.Unhealthy.UnhealthyReason.TIMED_OUT     // Catch:{ NoSuchFieldError -> 0x004a }
                X.C66583MXo.A1K(r0, r1, r4)     // Catch:{ NoSuchFieldError -> 0x004a }
            L_0x004a:
                com.instagram.debug.devoptions.sandboxselector.IgServerHealth$Unhealthy$UnhealthyReason r0 = com.instagram.debug.devoptions.sandboxselector.IgServerHealth.Unhealthy.UnhealthyReason.DJANGO_UNHEALTHY     // Catch:{ NoSuchFieldError -> 0x004f }
                X.C66583MXo.A1K(r0, r1, r3)     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                com.instagram.debug.devoptions.sandboxselector.IgServerHealth$Unhealthy$UnhealthyReason r0 = com.instagram.debug.devoptions.sandboxselector.IgServerHealth.Unhealthy.UnhealthyReason.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0054 }
                X.C66583MXo.A1K(r0, r1, r2)     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                $EnumSwitchMapping$2 = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.sandboxselector.SandboxViewStateConverterKt.WhenMappings.<clinit>():void");
        }
    }

    public static final List toAdapterItems(SandboxSelectorViewModel.ViewState viewState, Context context, 0sP r25, C62320sa r26, C62320sa r27) {
        SandboxSelectorViewModel.ViewState viewState2 = viewState;
        Context context2 = context;
        boolean A1Z = AnonymousClass7TG.A1Z(viewState2, context2);
        0sP r2 = r25;
        C62320sa r9 = r26;
        C62320sa r6 = r27;
        C51974G9v.A1M(r2, r9, r6);
        01N A1H = 0jo.A1H();
        String A0d = AnonymousClass7TF.A0d(context2.getResources(), 2131958256);
        A1H.add(new OIM((View.OnClickListener) null, (View.OnClickListener) null, (View.OnClickListener) null, (C358618bC) null, C69349Njo.TYPE_UNKNOWN, (Integer) null, (Integer) null, Integer.valueOf(R.color.igds_error_or_destructive), (Integer) null, (Integer) null, (Integer) null, (Integer) null, A0d, (String) null, (String) null, A1Z, A1Z));
        C46448DfA.A02(A1H, toStringRes(viewState2.connectionHealth.corpnetStatus));
        DbV.A1W(A1H, A1Z);
        C46448DfA.A02(A1H, 2131958245);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append('[');
        A1A.append(viewState2.sandboxes.currentSandbox.type);
        A1A.append("] ");
        A1H.add(new FGF((CharSequence) AnonymousClass7TF.A0l(viewState2.sandboxes.currentSandbox.url, A1A)));
        FGF.A01(A1H, toStringRes(viewState2.connectionHealth.serverHealth));
        A1H.add(new C67293MlS(context2, (View.OnClickListener) new SandboxViewStateConverterKt$toAdapterItems$1$1(r9), 2131958253));
        DbV.A1W(A1H, A1Z);
        A1H.addAll(toSandboxListAdapterItems(viewState2.sandboxes.availableSandboxes, context2, viewState2.connectionHealth.corpnetStatus, r2));
        C46448DfA.A02(A1H, 2131958247);
        A1H.add(new C67293MlS(context2, (View.OnClickListener) new SandboxViewStateConverterKt$toAdapterItems$1$2(r6), 2131958232));
        DbV.A1W(A1H, A1Z);
        return 0jo.A1I(A1H);
    }

    public static final int toStringRes(IgServerHealth igServerHealth) {
        if (igServerHealth instanceof IgServerHealth.CheckingHealth) {
            return 2131958234;
        }
        if (igServerHealth instanceof IgServerHealth.Healthy) {
            return 2131958233;
        }
        if (igServerHealth instanceof IgServerHealth.Unhealthy) {
            return toStringRes(((IgServerHealth.Unhealthy) igServerHealth).errorStatus);
        }
        throw AnonymousClass7TE.A1K();
    }

    public static final List toSandboxListAdapterItems(List list, Context context, CorpnetStatus corpnetStatus, 0sP r33) {
        OIM oim;
        ArrayList A1C = AnonymousClass7TE.A1C();
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        for (Object next : list) {
            ((List) JTS.A0h(((Sandbox) next).type, A1H)).add(next);
        }
        for (SandboxType sandboxType : SandboxType.values()) {
            0sn<Sandbox> r7 = (List) A1H.get(sandboxType);
            if (r7 == null) {
                r7 = 0sn.A00;
            }
            C46448DfA dfA = new C46448DfA(toStringRes(sandboxType));
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (Sandbox sandbox : r7) {
                if (sandbox.supportsVpnless || corpnetStatus == CorpnetStatus.ON_CORPNET) {
                    oim = new OIM(new SandboxViewStateConverterKt$toSandboxListAdapterItems$1(r33, sandbox), (View.OnClickListener) null, (View.OnClickListener) null, (C358618bC) null, C69349Njo.TYPE_UNKNOWN, (Integer) null, (Integer) null, Integer.valueOf(R.color.igds_primary_text), (Integer) null, Integer.valueOf(R.color.igds_secondary_text), (Integer) null, (Integer) null, sandbox.url, (String) null, sandbox.description, true, true);
                } else {
                    oim = new OIM((View.OnClickListener) null, (View.OnClickListener) null, (View.OnClickListener) null, (C358618bC) null, C69349Njo.TYPE_UNKNOWN, (Integer) null, (Integer) null, Integer.valueOf(R.color.igds_error_or_destructive), (Integer) null, (Integer) null, (Integer) null, (Integer) null, AnonymousClass7TF.A0d(context.getResources(), 2131958251), (String) null, (String) null, true, true);
                }
                A1C2.add(oim);
            }
            A1C.add(dfA);
            if (A1C2.isEmpty()) {
                A1C2.add(new OIM((View.OnClickListener) null, (View.OnClickListener) null, (View.OnClickListener) null, (C358618bC) null, C69349Njo.TYPE_UNKNOWN, (Integer) null, (Integer) null, Integer.valueOf(R.color.igds_error_or_destructive), (Integer) null, (Integer) null, (Integer) null, (Integer) null, AnonymousClass7TF.A0d(context.getResources(), 2131958252), (String) null, (String) null, true, true));
            }
            A1C.addAll(A1C2);
            DbV.A1W(A1C, true);
        }
        return A1C;
    }

    public static final int toStringRes(IgServerHealth.Unhealthy.UnhealthyReason unhealthyReason) {
        int ordinal = unhealthyReason.ordinal();
        if (ordinal == 0) {
            return 2131958241;
        }
        if (ordinal == 1) {
            return 2131958244;
        }
        if (ordinal == 2) {
            return 2131958242;
        }
        if (ordinal == 3) {
            return 2131958243;
        }
        throw AnonymousClass7TE.A1K();
    }

    public static final int toStringRes(CorpnetStatus corpnetStatus) {
        int ordinal = corpnetStatus.ordinal();
        if (ordinal == 2) {
            return 2131958227;
        }
        if (ordinal == 1) {
            return 2131958229;
        }
        if (ordinal == 0) {
            return 2131958228;
        }
        throw AnonymousClass7TE.A1K();
    }

    public static final int toStringRes(SandboxType sandboxType) {
        int ordinal = sandboxType.ordinal();
        if (ordinal == 0) {
            return 2131958250;
        }
        if (ordinal == 1) {
            return 2131958246;
        }
        if (ordinal == 2) {
            return 2131958248;
        }
        if (ordinal == 3) {
            return 2131958249;
        }
        throw AnonymousClass7TE.A1K();
    }
}
