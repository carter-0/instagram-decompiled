package X;

import com.instagram.autoplay.models.AutoplayCustomization;
import com.instagram.autoplay.models.AutoplayDowngradeReason;
import com.instagram.autoplay.models.AutoplayInitialSelectionSource;
import com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType;
import com.instagram.autoplay.models.AutoplayRecentBufferingDiagnosis;
import com.instagram.autoplay.models.AutoplayUpgradeReason;

/* renamed from: X.TuJ  reason: case insensitive filesystem */
public final class C14336TuJ {
    public AutoplayLoggingCustomizationSelectionType A00;
    public AutoplayRecentBufferingDiagnosis A01;
    public Integer A02;
    public final C14078TpS A03;
    public final C14088Tpf A04;
    public final C14384TvD A05;
    public final C14352Tuh A06;
    public final C14082TpW A07;
    public final C14083TpX A08;

    public static final void A00(C14336TuJ tuJ, AutoplayDowngradeReason autoplayDowngradeReason, AutoplayInitialSelectionSource autoplayInitialSelectionSource, AutoplayLoggingCustomizationSelectionType autoplayLoggingCustomizationSelectionType, AutoplayUpgradeReason autoplayUpgradeReason) {
        StringBuilder A0n;
        AutoplayUpgradeReason autoplayUpgradeReason2;
        StringBuilder sb = new StringBuilder();
        sb.append("autoplay_customization_selected");
        sb.append(AnonymousClass7TG.A0m(autoplayLoggingCustomizationSelectionType, "\t selectionType: ", new StringBuilder()));
        if (autoplayInitialSelectionSource != null) {
            sb.append(AnonymousClass7TG.A0m(autoplayInitialSelectionSource, "\t initialSource: ", new StringBuilder()));
        }
        if (autoplayUpgradeReason == AutoplayUpgradeReason.TO_BE_DETERMINED) {
            Integer num = tuJ.A02;
            if (num == null || num.intValue() >= tuJ.A04.A00()) {
                AutoplayRecentBufferingDiagnosis autoplayRecentBufferingDiagnosis = tuJ.A01;
                AutoplayRecentBufferingDiagnosis autoplayRecentBufferingDiagnosis2 = AutoplayRecentBufferingDiagnosis.CAN_BUFFER_MORE;
                if (autoplayRecentBufferingDiagnosis != autoplayRecentBufferingDiagnosis2 && tuJ.A05.A00 == autoplayRecentBufferingDiagnosis2) {
                    A0n = AnonymousClass7TF.A0n("\t upgradeReason: ");
                    autoplayUpgradeReason2 = AutoplayUpgradeReason.NETWORK_CAN_BUFFER_MORE;
                }
            } else {
                A0n = AnonymousClass7TF.A0n("\t upgradeReason: ");
                autoplayUpgradeReason2 = AutoplayUpgradeReason.MEMORY_FREED_UP;
            }
            A0n.append(autoplayUpgradeReason2);
            Pxf.A1O(sb, A0n);
        }
        if (autoplayDowngradeReason != null) {
            sb.append(AnonymousClass7TG.A0m(autoplayDowngradeReason, "\t downgradeReason: ", new StringBuilder()));
        }
        A01(tuJ, sb);
        tuJ.A01 = tuJ.A05.A00;
        tuJ.A02 = Integer.valueOf(tuJ.A04.A00());
        tuJ.A00 = autoplayLoggingCustomizationSelectionType;
    }

    public static final void A01(C14336TuJ tuJ, StringBuilder sb) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\t layout: ");
        sb2.append(tuJ.A03.A00);
        Pxf.A1O(sb, sb2);
        C14352Tuh tuh = tuJ.A06;
        AutoplayCustomization autoplayCustomization = tuh.A00;
        String str2 = null;
        if (autoplayCustomization != null) {
            str = autoplayCustomization.id;
        } else {
            str = null;
        }
        C66580MXl.A1V("\t autoplayCustomizationId: ", str, sb);
        AutoplayCustomization autoplayCustomization2 = tuh.A01;
        if (autoplayCustomization2 != null) {
            str2 = autoplayCustomization2.id;
        }
        C66580MXl.A1V("\t previousAutoplayCustomizationId: ", str2, sb);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\t previousAutoplayCustomizationTime: ");
        sb3.append(tuh.A03);
        Pxf.A1O(sb, sb3);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\t memoryColor: ");
        C14088Tpf tpf = tuJ.A04;
        sb4.append(tpf.A01.A00);
        Pxf.A1O(sb, sb4);
        sb.append(002.A0O("\t maximumConcurrentVideos: ", tpf.A00()));
        C14384TvD tvD = tuJ.A05;
        Long l = tvD.A01;
        if (l != null) {
            sb.append(AnonymousClass7TG.A0m(l, "\t averageLoadingAndBufferingTime: ", new StringBuilder()));
        }
        AutoplayRecentBufferingDiagnosis autoplayRecentBufferingDiagnosis = tvD.A00;
        if (autoplayRecentBufferingDiagnosis != null) {
            sb.append(AnonymousClass7TG.A0m(autoplayRecentBufferingDiagnosis, "\t bufferingDiagnosis: ", new StringBuilder()));
        }
        sb.append("\t deviceInfo: TODO: add once we have deviceInfo from endpoint");
        tuJ.A08.A01().isEmpty();
        C14082TpW tpW = tuJ.A07;
        C14082TpW.A00(tpW);
        tpW.A03.isEmpty();
        0qQ.A07(sb.toString());
    }

    public C14336TuJ(C14078TpS tpS, C14088Tpf tpf, C14384TvD tvD, C14352Tuh tuh, C14082TpW tpW, C14083TpX tpX) {
        this.A06 = tuh;
        this.A08 = tpX;
        this.A07 = tpW;
        this.A03 = tpS;
        this.A04 = tpf;
        this.A05 = tvD;
    }
}
