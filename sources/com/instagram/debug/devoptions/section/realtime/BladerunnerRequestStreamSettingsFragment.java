package com.instagram.debug.devoptions.section.realtime;

import X.002;
import X.0oU;
import X.0qQ;
import X.0rw;
import X.0sr;
import X.0tS;
import X.1w1;
import X.2da;
import X.AnonymousClass0eM;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C14729U5o;
import X.C17742VdB;
import X.C18080Vl9;
import X.C227642jf;
import X.C47518E6c;
import X.C50989Fmc;
import X.DbW;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import kotlin.enums.EnumEntries;

public final class BladerunnerRequestStreamSettingsFragment extends C47518E6c implements AnonymousClass4DS {
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);

    public enum RealTimeSandboxConfigSourceKey {
        BLADERUNNER,
        DISTILLERY,
        WWW;

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        /* access modifiers changed from: public */
        static {
            RealTimeSandboxConfigSourceKey[] $values;
            $ENTRIES = 0oU.A00($values);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.instagram.debug.devoptions.section.realtime.BladerunnerRequestStreamSettingsFragment$RealTimeSandboxConfigSourceKey[] r0 = com.instagram.debug.devoptions.section.realtime.BladerunnerRequestStreamSettingsFragment.RealTimeSandboxConfigSourceKey.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.instagram.debug.devoptions.section.realtime.BladerunnerRequestStreamSettingsFragment$RealTimeSandboxConfigSourceKey r0 = com.instagram.debug.devoptions.section.realtime.BladerunnerRequestStreamSettingsFragment.RealTimeSandboxConfigSourceKey.BLADERUNNER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.instagram.debug.devoptions.section.realtime.BladerunnerRequestStreamSettingsFragment$RealTimeSandboxConfigSourceKey r0 = com.instagram.debug.devoptions.section.realtime.BladerunnerRequestStreamSettingsFragment.RealTimeSandboxConfigSourceKey.DISTILLERY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.instagram.debug.devoptions.section.realtime.BladerunnerRequestStreamSettingsFragment$RealTimeSandboxConfigSourceKey r0 = com.instagram.debug.devoptions.section.realtime.BladerunnerRequestStreamSettingsFragment.RealTimeSandboxConfigSourceKey.WWW     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.section.realtime.BladerunnerRequestStreamSettingsFragment.WhenMappings.<clinit>():void");
        }
    }

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, "Bladerunner RequestStream");
    }

    public String getModuleName() {
        return "bladerunner_requeststream_settings";
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        generateView();
    }

    /* access modifiers changed from: private */
    public final void generateView() {
        0tS.A4E.A00();
        setItems(0sr.A1P(new C50989Fmc[]{getMenuItem("Override WWW Host", "od.12345 / www.od.12345.facebook.com / <unixname>.sb", "Sets \"www_sandbox\" header (for FBGQLS)\nControls where Bladerunner finds WWW\nCommon overrides are:\nod.12345\nwww.od.12345.facebook.com\n<unixname>.sb\nLeave blank for default", RealTimeSandboxConfigSourceKey.WWW), getMenuItem("Override Distillery Host", "xxxxx.od.fbinfra.net:8086", "Sets \"distillery_osandbox\" header (for IGGQLS)\nControls where Bladerunner finds Distillery\nCommon overrides are:\nxxxxx.od.fbinfra.net:8086\nLeave blank for default", RealTimeSandboxConfigSourceKey.DISTILLERY), getMenuItem("Override Bladerunner Host", "xxxxx.od.fbinfra.net:18295", "Sets \"OverrideServer\" header\nControls where Warpgate/Stargate finds Bladerunnner\nCommon overrides are:\nxxxxx.od.fbinfra.net:18295\ndevvmXXXXX.vll0.facebook.com:18295\nLeave blank for default", RealTimeSandboxConfigSourceKey.BLADERUNNER)}));
    }

    private final C50989Fmc getMenuItem(String str, String str2, String str3, RealTimeSandboxConfigSourceKey realTimeSandboxConfigSourceKey) {
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setOrientation(1);
        SearchEditText searchEditText = new SearchEditText(requireContext(), (AttributeSet) null, 0);
        searchEditText.setHint(str2);
        searchEditText.setText(getValueForSandboxOverride(realTimeSandboxConfigSourceKey));
        searchEditText.setInputType(1);
        searchEditText.setPadding(4, 4, 4, 4);
        linearLayout.addView(searchEditText);
        IgTextView igTextView = new IgTextView(requireContext());
        igTextView.setText(str3);
        igTextView.setPadding(12, 12, 12, 12);
        igTextView.setTextColor(Color.parseColor("#999999"));
        linearLayout.addView(igTextView);
        C18080Vl9 vl9 = new C18080Vl9(requireContext());
        vl9.A08(str);
        C17742VdB vdB = vl9.A01;
        vl9.A07(linearLayout);
        BladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$1 bladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$1 = new BladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$1(this, realTimeSandboxConfigSourceKey);
        vdB.A0E = vdB.A0L.getText(2131958193);
        vdB.A02 = bladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$1;
        vl9.A04(new BladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$2(this, realTimeSandboxConfigSourceKey, searchEditText), 2131960992);
        C14729U5o A00 = vl9.A00();
        Context requireContext = requireContext();
        String valueForSandboxOverride = getValueForSandboxOverride(realTimeSandboxConfigSourceKey);
        if (valueForSandboxOverride.length() == 0) {
            valueForSandboxOverride = "(default)";
        }
        return new C50989Fmc(requireContext, (View.OnClickListener) new BladerunnerRequestStreamSettingsFragment$getMenuItem$3(A00), (CharSequence) 0rw.A0u(002.A0u(str, "\n      |", valueForSandboxOverride, "\n    "), "|"));
    }

    private final String getValueForSandboxOverride(RealTimeSandboxConfigSourceKey realTimeSandboxConfigSourceKey) {
        String bladerunnerSandbox;
        int ordinal = realTimeSandboxConfigSourceKey.ordinal();
        if (ordinal == 0) {
            bladerunnerSandbox = 1w1.A01.A00().getBladerunnerSandbox();
        } else if (ordinal == 1) {
            bladerunnerSandbox = 1w1.A01.A00().getDistillerySandbox();
        } else if (ordinal == 2) {
            bladerunnerSandbox = 1w1.A01.A00().getWwwSandbox();
        } else {
            throw AnonymousClass7TE.A1K();
        }
        if (bladerunnerSandbox != null) {
            return bladerunnerSandbox;
        }
        return "";
    }

    /* access modifiers changed from: private */
    public final void setValueForSandboxOverride(RealTimeSandboxConfigSourceKey realTimeSandboxConfigSourceKey, String str) {
        int ordinal = realTimeSandboxConfigSourceKey.ordinal();
        if (ordinal == 0) {
            1w1.A01.A00().setBladerunnerSandbox(str);
        } else if (ordinal == 1) {
            1w1.A01.A00().setDistillerySandbox(str);
        } else if (ordinal == 2) {
            1w1.A01.A00().setWwwSandbox(str);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
