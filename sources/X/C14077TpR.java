package X;

import com.instagram.autoplay.models.AutoplayPlaybackState;
import com.instagram.autoplay.models.AutoplayScreenItemWithoutMetadata;
import java.util.Map;

/* renamed from: X.TpR  reason: case insensitive filesystem */
public final class C14077TpR {
    public final C14078TpS A00;
    public final C14336TuJ A01;
    public final VM9 A02;
    public final C14082TpW A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C51801G2k(this, 17));
    public final C14389TvI A05;
    public final C14390TvJ A06;
    public final C14083TpX A07;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        if (r8 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0082, code lost:
        if (r8 != null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0479, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0094, code lost:
        if (X.0qQ.A0K(X.00k.A0L(X.C14078TpS.A00(r4, r4.A01())), r8) == false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0096, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0097, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0098, code lost:
        if (r13 == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009a, code lost:
        r2 = com.instagram.autoplay.models.AutoplayCustomizationSelectionReason.FIRST_CHOICE_OR_CUSTOMIZATION_MISSING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
        if (r0 >= 0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009e, code lost:
        r2 = r6.A01;
        r0 = r2.A00;
        r1 = com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType.COULD_NOT_DOWNGRADE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (r0 == r1) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a6, code lost:
        X.C14336TuJ.A00(r2, (com.instagram.autoplay.models.AutoplayDowngradeReason) null, (com.instagram.autoplay.models.AutoplayInitialSelectionSource) null, r1, (com.instagram.autoplay.models.AutoplayUpgradeReason) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f2, code lost:
        if (r0 >= X.C14078TpS.A00(r4, r4.A01()).size()) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f4, code lost:
        r5.A01((com.instagram.autoplay.models.AutoplayCustomization) X.00k.A0O(X.C14078TpS.A00(r4, r4.A01()), r0));
        r1 = r2.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010a, code lost:
        if (r1 == 0) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010d, code lost:
        if (r1 == 2) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010f, code lost:
        if (r1 == 1) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0112, code lost:
        if (r1 != 3) goto L_0x0474;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0114, code lost:
        r3 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011c, code lost:
        if (r4.A01.BAr() == false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011e, code lost:
        r2 = com.instagram.autoplay.models.AutoplayInitialSelectionSource.CACHED_FROM_LAST_SESSION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0120, code lost:
        X.C14336TuJ.A00(r3, (com.instagram.autoplay.models.AutoplayDowngradeReason) null, r2, com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType.INITIAL, (com.instagram.autoplay.models.AutoplayUpgradeReason) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0127, code lost:
        r2 = com.instagram.autoplay.models.AutoplayInitialSelectionSource.LOCAL_NO_CACHE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012a, code lost:
        X.C14336TuJ.A00(r6.A01, (com.instagram.autoplay.models.AutoplayDowngradeReason) null, (com.instagram.autoplay.models.AutoplayInitialSelectionSource) null, com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType.UPGRADE, com.instagram.autoplay.models.AutoplayUpgradeReason.TO_BE_DETERMINED);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0136, code lost:
        r3 = r6.A01;
        r2 = com.instagram.autoplay.models.AutoplayDowngradeReason.NETWORK_TOO_MUCH_BUFFERING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013b, code lost:
        r3 = r6.A01;
        r2 = com.instagram.autoplay.models.AutoplayDowngradeReason.MEMORY_CONSTRAINED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013f, code lost:
        X.C14336TuJ.A00(r3, r2, (com.instagram.autoplay.models.AutoplayInitialSelectionSource) null, com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType.DOWNGRADE, (com.instagram.autoplay.models.AutoplayUpgradeReason) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0147, code lost:
        if (r10 == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0149, code lost:
        r2 = com.instagram.autoplay.models.AutoplayCustomizationSelectionReason.NOT_ENOUGH_MEMORY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014d, code lost:
        if (r15 == false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014f, code lost:
        r0 = r3 - 1;
        r2 = com.instagram.autoplay.models.AutoplayCustomizationSelectionReason.TOO_MUCH_BUFFERING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0155, code lost:
        if (r1 == false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0157, code lost:
        if (r14 == false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0159, code lost:
        r0 = r3 + 1;
        r2 = com.instagram.autoplay.models.AutoplayCustomizationSelectionReason.CAN_BUFFER_MORE_AND_HAS_MEMORY_AVAILABLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015f, code lost:
        if (r8 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0161, code lost:
        if (r14 == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0163, code lost:
        if (r0 != -1) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016d, code lost:
        if (r6.A02.A00() <= r8.maxConcurrentBuffering) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016f, code lost:
        r2 = r6.A01;
        r0 = r2.A00;
        r1 = com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType.COULD_NOT_UPGRADE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0177, code lost:
        r1 = X.C14078TpS.A00(r4, r4.A01());
        r12 = r1.listIterator(r1.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018b, code lost:
        if (r12.hasPrevious() == false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018d, code lost:
        r11 = r12.previous();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019c, code lost:
        if (((com.instagram.autoplay.models.AutoplayCustomization) r11).maxConcurrentPlaying > r6.A02.A00()) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a2, code lost:
        if (X.0qQ.A0K(r11, r8) != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a4, code lost:
        r0 = X.C14078TpS.A00(r4, r4.A01());
        X.0qQ.A0B(r0, 0);
        r0 = r0.indexOf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b3, code lost:
        if (r0 == -1) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b5, code lost:
        if (r0 == r3) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b7, code lost:
        if (r0 <= r3) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b9, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01bc, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01be, code lost:
        if (r0 >= r3) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c0, code lost:
        r10 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r18 = this;
            r7 = r18
            X.VM9 r0 = r7.A02
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x047a
            X.TvI r6 = r7.A05
            X.Tuh r5 = r6.A04
            java.lang.Long r0 = r5.A02
            if (r0 == 0) goto L_0x0028
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r0.longValue()
            long r3 = r3 - r0
            X.TpS r0 = r5.A04
            com.instagram.autoplay.models.AutoplayConfigRoot r0 = r0.A01()
            com.instagram.autoplay.models.AutoplayGlobalConfig r0 = r0.globalConfig
            int r0 = r0.bufferingLatencyRecencyThresholdMs
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00aa
        L_0x0028:
            X.TvD r4 = r6.A03
            X.TpW r0 = r4.A03
            X.C14082TpW.A00(r0)
            java.util.List r8 = r0.A03
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x01d0
            r15 = 0
        L_0x0039:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r4.A01 = r0
            X.TpS r1 = r4.A02
            com.instagram.autoplay.models.AutoplayConfigRoot r0 = r1.A01()
            com.instagram.autoplay.models.AutoplayGlobalConfig r0 = r0.globalConfig
            int r3 = r0.bufferingLatencyNormativeMinimumThresholdMs
            com.instagram.autoplay.models.AutoplayConfigRoot r0 = r1.A01()
            com.instagram.autoplay.models.AutoplayGlobalConfig r0 = r0.globalConfig
            int r0 = r0.bufferingLatencyNormativeMaximumThresholdMs
            long r0 = (long) r0
            int r2 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x01c3
            com.instagram.autoplay.models.AutoplayRecentBufferingDiagnosis r1 = com.instagram.autoplay.models.AutoplayRecentBufferingDiagnosis.TOO_MUCH_BUFFERING
        L_0x0058:
            r4.A00 = r1
            com.instagram.autoplay.models.AutoplayRecentBufferingDiagnosis r0 = com.instagram.autoplay.models.AutoplayRecentBufferingDiagnosis.TOO_MUCH_BUFFERING
            r10 = 0
            r9 = 1
            boolean r15 = X.AnonymousClass7TF.A1W(r1, r0)
            com.instagram.autoplay.models.AutoplayRecentBufferingDiagnosis r0 = com.instagram.autoplay.models.AutoplayRecentBufferingDiagnosis.CAN_BUFFER_MORE
            boolean r14 = X.AnonymousClass7TF.A1W(r1, r0)
            com.instagram.autoplay.models.AutoplayCustomization r8 = r5.A00
            X.TpS r4 = r6.A00
            com.instagram.autoplay.models.AutoplayConfigRoot r0 = r4.A01()
            java.util.List r0 = X.C14078TpS.A00(r4, r0)
            X.0qQ.A0B(r0, r10)
            int r3 = r0.indexOf(r8)
            r2 = -1
            if (r3 == r2) goto L_0x0081
            r13 = 0
            if (r8 != 0) goto L_0x0084
        L_0x0081:
            r13 = 1
            if (r8 == 0) goto L_0x0177
        L_0x0084:
            com.instagram.autoplay.models.AutoplayConfigRoot r0 = r4.A01()
            java.util.List r0 = X.C14078TpS.A00(r4, r0)
            java.lang.Object r0 = X.00k.A0L(r0)
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 == 0) goto L_0x0177
        L_0x0096:
            r0 = -1
        L_0x0097:
            r1 = 0
        L_0x0098:
            if (r13 == 0) goto L_0x0147
            com.instagram.autoplay.models.AutoplayCustomizationSelectionReason r2 = com.instagram.autoplay.models.AutoplayCustomizationSelectionReason.FIRST_CHOICE_OR_CUSTOMIZATION_MISSING
        L_0x009c:
            if (r0 >= 0) goto L_0x00e6
            X.TuJ r2 = r6.A01
            com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType r0 = r2.A00
            com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType r1 = com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType.COULD_NOT_DOWNGRADE
        L_0x00a4:
            if (r0 == r1) goto L_0x00aa
            r0 = 0
            X.C14336TuJ.A00(r2, r0, r0, r1, r0)
        L_0x00aa:
            X.TvJ r5 = r7.A06
            X.Tuh r4 = r5.A02
            com.instagram.autoplay.models.AutoplayCustomization r0 = r4.A00
            if (r0 == 0) goto L_0x02c7
            com.instagram.autoplay.models.AutoplayWhichVideos r8 = r0.whichVideos
            X.TpX r0 = r5.A04
            java.util.ArrayList r0 = r0.A01()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x00c3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x024d
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.instagram.autoplay.models.AutoplayScreenItemWithoutMetadata r0 = (com.instagram.autoplay.models.AutoplayScreenItemWithoutMetadata) r0
            X.TpW r1 = r5.A03
            X.1Xj r0 = r0.media
            com.instagram.autoplay.models.AutoplayPlaybackHistory r0 = r1.A01(r0)
            com.instagram.autoplay.models.AutoplayPlaybackState r1 = r0.currentState
            java.util.List r0 = r5.A05
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00c3
            r6.add(r2)
            goto L_0x00c3
        L_0x00e6:
            com.instagram.autoplay.models.AutoplayConfigRoot r1 = r4.A01()
            java.util.List r1 = X.C14078TpS.A00(r4, r1)
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x016f
            com.instagram.autoplay.models.AutoplayConfigRoot r1 = r4.A01()
            java.util.List r1 = X.C14078TpS.A00(r4, r1)
            java.lang.Object r0 = X.00k.A0O(r1, r0)
            com.instagram.autoplay.models.AutoplayCustomization r0 = (com.instagram.autoplay.models.AutoplayCustomization) r0
            r5.A01(r0)
            int r1 = r2.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0136
            r0 = 2
            if (r1 == r0) goto L_0x013b
            if (r1 == r9) goto L_0x012a
            r0 = 3
            if (r1 != r0) goto L_0x0474
            X.TuJ r3 = r6.A01
            X.X6I r0 = r4.A01
            boolean r0 = r0.BAr()
            if (r0 == 0) goto L_0x0127
            com.instagram.autoplay.models.AutoplayInitialSelectionSource r2 = com.instagram.autoplay.models.AutoplayInitialSelectionSource.CACHED_FROM_LAST_SESSION
        L_0x0120:
            com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType r1 = com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType.INITIAL
            r0 = 0
            X.C14336TuJ.A00(r3, r0, r2, r1, r0)
            goto L_0x00aa
        L_0x0127:
            com.instagram.autoplay.models.AutoplayInitialSelectionSource r2 = com.instagram.autoplay.models.AutoplayInitialSelectionSource.LOCAL_NO_CACHE
            goto L_0x0120
        L_0x012a:
            X.TuJ r3 = r6.A01
            com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType r2 = com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType.UPGRADE
            com.instagram.autoplay.models.AutoplayUpgradeReason r1 = com.instagram.autoplay.models.AutoplayUpgradeReason.TO_BE_DETERMINED
            r0 = 0
            X.C14336TuJ.A00(r3, r0, r0, r2, r1)
            goto L_0x00aa
        L_0x0136:
            X.TuJ r3 = r6.A01
            com.instagram.autoplay.models.AutoplayDowngradeReason r2 = com.instagram.autoplay.models.AutoplayDowngradeReason.NETWORK_TOO_MUCH_BUFFERING
            goto L_0x013f
        L_0x013b:
            X.TuJ r3 = r6.A01
            com.instagram.autoplay.models.AutoplayDowngradeReason r2 = com.instagram.autoplay.models.AutoplayDowngradeReason.MEMORY_CONSTRAINED
        L_0x013f:
            com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType r1 = com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType.DOWNGRADE
            r0 = 0
            X.C14336TuJ.A00(r3, r2, r0, r1, r0)
            goto L_0x00aa
        L_0x0147:
            if (r10 == 0) goto L_0x014d
            com.instagram.autoplay.models.AutoplayCustomizationSelectionReason r2 = com.instagram.autoplay.models.AutoplayCustomizationSelectionReason.NOT_ENOUGH_MEMORY
            goto L_0x009c
        L_0x014d:
            if (r15 == 0) goto L_0x0155
            int r0 = r3 - r9
            com.instagram.autoplay.models.AutoplayCustomizationSelectionReason r2 = com.instagram.autoplay.models.AutoplayCustomizationSelectionReason.TOO_MUCH_BUFFERING
            goto L_0x009c
        L_0x0155:
            if (r1 == 0) goto L_0x015f
            if (r14 == 0) goto L_0x015f
            int r0 = r3 + 1
            com.instagram.autoplay.models.AutoplayCustomizationSelectionReason r2 = com.instagram.autoplay.models.AutoplayCustomizationSelectionReason.CAN_BUFFER_MORE_AND_HAS_MEMORY_AVAILABLE
            goto L_0x009c
        L_0x015f:
            if (r8 == 0) goto L_0x00aa
            if (r14 == 0) goto L_0x00aa
            if (r0 != r2) goto L_0x00aa
            X.Tpf r0 = r6.A02
            int r1 = r0.A00()
            int r0 = r8.maxConcurrentBuffering
            if (r1 <= r0) goto L_0x00aa
        L_0x016f:
            X.TuJ r2 = r6.A01
            com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType r0 = r2.A00
            com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType r1 = com.instagram.autoplay.models.AutoplayLoggingCustomizationSelectionType.COULD_NOT_UPGRADE
            goto L_0x00a4
        L_0x0177:
            com.instagram.autoplay.models.AutoplayConfigRoot r0 = r4.A01()
            java.util.List r1 = X.C14078TpS.A00(r4, r0)
            int r0 = r1.size()
            java.util.ListIterator r12 = r1.listIterator(r0)
        L_0x0187:
            boolean r0 = r12.hasPrevious()
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r11 = r12.previous()
            r0 = r11
            com.instagram.autoplay.models.AutoplayCustomization r0 = (com.instagram.autoplay.models.AutoplayCustomization) r0
            int r1 = r0.maxConcurrentPlaying
            X.Tpf r0 = r6.A02
            int r0 = r0.A00()
            if (r1 > r0) goto L_0x0187
        L_0x019e:
            boolean r0 = X.0qQ.A0K(r11, r8)
            if (r0 != 0) goto L_0x0096
            com.instagram.autoplay.models.AutoplayConfigRoot r0 = r4.A01()
            java.util.List r0 = X.C14078TpS.A00(r4, r0)
            X.0qQ.A0B(r0, r10)
            int r0 = r0.indexOf(r11)
            if (r0 == r2) goto L_0x0097
            if (r0 == r3) goto L_0x0097
            if (r0 <= r3) goto L_0x01be
            r1 = 1
            goto L_0x0098
        L_0x01bc:
            r11 = 0
            goto L_0x019e
        L_0x01be:
            if (r0 >= r3) goto L_0x0097
            r10 = 1
            goto L_0x0097
        L_0x01c3:
            long r0 = (long) r3
            int r2 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x01cc
            com.instagram.autoplay.models.AutoplayRecentBufferingDiagnosis r1 = com.instagram.autoplay.models.AutoplayRecentBufferingDiagnosis.CAN_BUFFER_MORE
            goto L_0x0058
        L_0x01cc:
            com.instagram.autoplay.models.AutoplayRecentBufferingDiagnosis r1 = com.instagram.autoplay.models.AutoplayRecentBufferingDiagnosis.NORMATIVE_BUFFERING
            goto L_0x0058
        L_0x01d0:
            X.TpS r0 = r4.A02
            com.instagram.autoplay.models.AutoplayConfigRoot r0 = r0.A01()
            com.instagram.autoplay.models.AutoplayGlobalConfig r0 = r0.globalConfig
            int r3 = r0.bufferingLatencyRecencyThresholdMs
            java.util.Iterator r17 = r8.iterator()
            r15 = 0
        L_0x01e0:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0245
            java.lang.Object r11 = r17.next()
            com.instagram.autoplay.models.AutoplayPlaybackHistory r11 = (com.instagram.autoplay.models.AutoplayPlaybackHistory) r11
            com.instagram.autoplay.models.AutoplayPlaybackState r1 = r11.currentState
            com.instagram.autoplay.models.AutoplayPlaybackState r2 = com.instagram.autoplay.models.AutoplayPlaybackState.BUFFERING
            if (r1 == r2) goto L_0x01f6
            com.instagram.autoplay.models.AutoplayPlaybackState r0 = com.instagram.autoplay.models.AutoplayPlaybackState.PLAYBACK_REQUESTED
            if (r1 != r0) goto L_0x01fe
        L_0x01f6:
            long r9 = java.lang.System.currentTimeMillis()
            long r0 = r11.currentStateStartTime
            long r9 = r9 - r0
            long r15 = r15 + r9
        L_0x01fe:
            java.util.List r0 = r11.historicalPlaybackSegments
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r14 = r0.iterator()
        L_0x0209:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0229
            java.lang.Object r10 = r14.next()
            r9 = r10
            com.instagram.autoplay.models.AutoplayPlaybackSegment r9 = (com.instagram.autoplay.models.AutoplayPlaybackSegment) r9
            long r12 = java.lang.System.currentTimeMillis()
            long r0 = r9.startTime
            long r12 = r12 - r0
            long r0 = r9.duration
            long r12 = r12 - r0
            long r0 = (long) r3
            int r9 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x0209
            r11.add(r10)
            goto L_0x0209
        L_0x0229:
            java.util.Iterator r10 = r11.iterator()
        L_0x022d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01e0
            java.lang.Object r9 = r10.next()
            com.instagram.autoplay.models.AutoplayPlaybackSegment r9 = (com.instagram.autoplay.models.AutoplayPlaybackSegment) r9
            com.instagram.autoplay.models.AutoplayPlaybackState r1 = r9.state
            if (r1 == r2) goto L_0x0241
            com.instagram.autoplay.models.AutoplayPlaybackState r0 = com.instagram.autoplay.models.AutoplayPlaybackState.PLAYBACK_REQUESTED
            if (r1 != r0) goto L_0x022d
        L_0x0241:
            long r0 = r9.duration
            long r15 = r15 + r0
            goto L_0x022d
        L_0x0245:
            int r0 = r8.size()
            long r0 = (long) r0
            long r15 = r15 / r0
            goto L_0x0039
        L_0x024d:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x02c7
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r6 = r6.iterator()
        L_0x025b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0278
            java.lang.Object r3 = r6.next()
            com.instagram.autoplay.models.AutoplayScreenItemWithoutMetadata r3 = (com.instagram.autoplay.models.AutoplayScreenItemWithoutMetadata) r3
            X.1Xj r2 = r3.media
            X.TpW r0 = r5.A03
            com.instagram.autoplay.models.AutoplayPlaybackHistory r1 = r0.A01(r2)
            com.instagram.autoplay.models.AutoplayWhichVideoMetadata r0 = new com.instagram.autoplay.models.AutoplayWhichVideoMetadata
            r0.<init>(r2, r1, r3)
            r7.add(r0)
            goto L_0x025b
        L_0x0278:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x02c7
            java.util.List r0 = r8.chooseNextVideosToPause(r7)
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x028a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x029c
            java.lang.Object r0 = r1.next()
            com.instagram.autoplay.models.AutoplayWhichVideoMetadata r0 = (com.instagram.autoplay.models.AutoplayWhichVideoMetadata) r0
            X.1Xj r0 = r0.media
            r2.add(r0)
            goto L_0x028a
        L_0x029c:
            java.util.Iterator r3 = r2.iterator()
        L_0x02a0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02c7
            java.lang.Object r2 = r3.next()
            X.1Xj r2 = (X.1Xj) r2
            java.lang.String r1 = "pausing "
            java.lang.String r0 = r2.getId()
            java.lang.String r1 = X.002.A0R(r1, r0)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.TpW r1 = r5.A03
            com.instagram.autoplay.models.AutoplayPlaybackState r0 = com.instagram.autoplay.models.AutoplayPlaybackState.PAUSED
            r1.A02(r0, r2)
            X.X8M r0 = r5.A00
            r0.EyG(r2)
            goto L_0x02a0
        L_0x02c7:
            com.instagram.autoplay.models.AutoplayCustomization r9 = r4.A00
            r11 = 0
            if (r9 == 0) goto L_0x047a
            X.TpW r10 = r5.A03
            X.C14082TpW.A00(r10)
            java.util.List r8 = r10.A03
            boolean r3 = r8 instanceof java.util.Collection
            r7 = 0
            if (r3 == 0) goto L_0x042f
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x042f
        L_0x02de:
            X.C14082TpW.A00(r10)
            r6 = 0
            if (r3 == 0) goto L_0x044e
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x044e
        L_0x02ea:
            X.TuJ r3 = r5.A01
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "maybePlayNextVideo: playing "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r2 = "  of max "
            r1.append(r2)
            int r0 = r9.maxConcurrentPlaying
            r1.append(r0)
            java.lang.String r0 = " , buffering "
            r1.append(r0)
            r1.append(r6)
            r1.append(r2)
            int r0 = r9.maxConcurrentBuffering
            r1.append(r0)
            java.lang.String r0 = ", onScreen "
            r1.append(r0)
            X.TpX r13 = r5.A04
            java.util.ArrayList r0 = r13.A01()
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.0qQ.A0B(r0, r11)
            int r0 = r9.maxConcurrentBuffering
            if (r6 >= r0) goto L_0x047a
            int r6 = r6 + r7
            int r0 = r9.maxConcurrentPlaying
            if (r6 >= r0) goto L_0x047a
            com.instagram.autoplay.models.AutoplayWhichVideos r12 = r9.whichVideos
            java.util.ArrayList r0 = r13.A01()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r0.iterator()
        L_0x0344:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x036d
            java.lang.Object r6 = r11.next()
            r7 = r6
            com.instagram.autoplay.models.AutoplayOnScreenItemWithMetadata r7 = (com.instagram.autoplay.models.AutoplayOnScreenItemWithMetadata) r7
            X.1Xj r0 = r7.media
            com.instagram.autoplay.models.AutoplayPlaybackHistory r0 = r10.A01(r0)
            com.instagram.autoplay.models.AutoplayPlaybackState r2 = r0.currentState
            java.util.List r0 = r5.A05
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0344
            float r0 = r7.percentageVisible
            boolean r0 = r12.hasMinimumVisibility(r0)
            if (r0 == 0) goto L_0x0344
            r1.add(r6)
            goto L_0x0344
        L_0x036d:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x047a
            r6 = 10
            int r0 = X.0Yv.A1E(r1, r6)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r0)
            java.util.Iterator r14 = r1.iterator()
        L_0x0382:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x039d
            java.lang.Object r7 = r14.next()
            com.instagram.autoplay.models.AutoplayScreenItemWithoutMetadata r7 = (com.instagram.autoplay.models.AutoplayScreenItemWithoutMetadata) r7
            X.1Xj r2 = r7.media
            com.instagram.autoplay.models.AutoplayPlaybackHistory r1 = r10.A01(r2)
            com.instagram.autoplay.models.AutoplayWhichVideoMetadata r0 = new com.instagram.autoplay.models.AutoplayWhichVideoMetadata
            r0.<init>(r2, r1, r7)
            r11.add(r0)
            goto L_0x0382
        L_0x039d:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x047a
            X.C14082TpW.A00(r10)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x03af:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x03c6
            java.lang.Object r2 = r8.next()
            r0 = r2
            com.instagram.autoplay.models.AutoplayPlaybackHistory r0 = (com.instagram.autoplay.models.AutoplayPlaybackHistory) r0
            com.instagram.autoplay.models.AutoplayPlaybackState r1 = r0.currentState
            com.instagram.autoplay.models.AutoplayPlaybackState r0 = com.instagram.autoplay.models.AutoplayPlaybackState.PAUSED
            if (r1 != r0) goto L_0x03af
            r7.add(r2)
            goto L_0x03af
        L_0x03c6:
            r1 = 8
            X.WqD r0 = new X.WqD
            r0.<init>(r1)
            java.util.List r1 = X.00k.A0g(r7, r0)
            int r0 = X.0Yv.A1E(r1, r6)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r7 = r1.iterator()
        L_0x03de:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x03f9
            java.lang.Object r6 = r7.next()
            com.instagram.autoplay.models.AutoplayPlaybackHistory r6 = (com.instagram.autoplay.models.AutoplayPlaybackHistory) r6
            X.1Xj r2 = r6.media
            com.instagram.autoplay.models.AutoplayScreenItemWithoutMetadata r1 = r13.A00(r2)
            com.instagram.autoplay.models.AutoplayWhichVideoMetadata r0 = new com.instagram.autoplay.models.AutoplayWhichVideoMetadata
            r0.<init>(r2, r6, r1)
            r8.add(r0)
            goto L_0x03de
        L_0x03f9:
            java.lang.Object r0 = X.00k.A0J(r8)
            com.instagram.autoplay.models.AutoplayWhichVideoMetadata r0 = (com.instagram.autoplay.models.AutoplayWhichVideoMetadata) r0
            com.instagram.autoplay.models.AutoplayWhichVideoMetadata r0 = r12.chooseNextVideoToPlay(r11, r0)
            X.1Xj r2 = r0.media
            if (r2 == 0) goto L_0x047a
            com.instagram.autoplay.models.AutoplayPlaybackState r0 = com.instagram.autoplay.models.AutoplayPlaybackState.PLAYBACK_REQUESTED
            r10.A02(r0, r2)
            X.X8M r1 = r5.A00
            int r0 = r9.previewDurationMs
            r1.Ewj(r2, r0)
            java.lang.String r2 = r2.getId()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "autoplay_video_playback_requested"
            r1.append(r0)
            java.lang.String r0 = "\t mediaId: "
            java.lang.String r0 = X.002.A0R(r0, r2)
            r1.append(r0)
            X.C14336TuJ.A01(r3, r1)
            goto L_0x02c7
        L_0x042f:
            java.util.Iterator r2 = r8.iterator()
        L_0x0433:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02de
            java.lang.Object r0 = r2.next()
            com.instagram.autoplay.models.AutoplayPlaybackHistory r0 = (com.instagram.autoplay.models.AutoplayPlaybackHistory) r0
            com.instagram.autoplay.models.AutoplayPlaybackState r1 = r0.currentState
            com.instagram.autoplay.models.AutoplayPlaybackState r0 = com.instagram.autoplay.models.AutoplayPlaybackState.PLAYING
            if (r1 == r0) goto L_0x0449
            com.instagram.autoplay.models.AutoplayPlaybackState r0 = com.instagram.autoplay.models.AutoplayPlaybackState.PLAYING_AND_LOOPED_ONCE
            if (r1 != r0) goto L_0x0433
        L_0x0449:
            int r7 = r7 + 1
            if (r7 >= 0) goto L_0x0433
            goto L_0x046c
        L_0x044e:
            java.util.Iterator r2 = r8.iterator()
        L_0x0452:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02ea
            java.lang.Object r0 = r2.next()
            com.instagram.autoplay.models.AutoplayPlaybackHistory r0 = (com.instagram.autoplay.models.AutoplayPlaybackHistory) r0
            com.instagram.autoplay.models.AutoplayPlaybackState r1 = r0.currentState
            com.instagram.autoplay.models.AutoplayPlaybackState r0 = com.instagram.autoplay.models.AutoplayPlaybackState.PLAYBACK_REQUESTED
            if (r1 == r0) goto L_0x0468
            com.instagram.autoplay.models.AutoplayPlaybackState r0 = com.instagram.autoplay.models.AutoplayPlaybackState.BUFFERING
            if (r1 != r0) goto L_0x0452
        L_0x0468:
            int r6 = r6 + 1
            if (r6 >= 0) goto L_0x0452
        L_0x046c:
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0474:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x047a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14077TpR.A00():void");
    }

    public final void A01(1Xj r7, boolean z) {
        0qQ.A0B(002.A19("onScreenStateChanged: ", r7.getId(), ", isOnScreen ", z), 0);
        C14083TpX tpX = this.A07;
        Map map = tpX.A02;
        String id = r7.getId();
        if (!z) {
            0u4.A03(map).remove(id);
            Map map2 = tpX.A03;
            0u4.A03(map2).remove(r7.getId());
            C14082TpW tpW = tpX.A01;
            AutoplayPlaybackState autoplayPlaybackState = tpW.A01(r7).currentState;
            if (autoplayPlaybackState == AutoplayPlaybackState.PLAYBACK_REQUESTED || autoplayPlaybackState == AutoplayPlaybackState.PLAYING || autoplayPlaybackState == AutoplayPlaybackState.BUFFERING || autoplayPlaybackState == AutoplayPlaybackState.PLAYING_AND_LOOPED_ONCE) {
                tpW.A02(AutoplayPlaybackState.PAUSED, r7);
                tpX.A00.EyG(r7);
            }
        } else if (id != null) {
            map.put(id, new AutoplayScreenItemWithoutMetadata(r7, System.currentTimeMillis()));
        } else {
            throw new IllegalStateException("Required value was null.");
        }
        ((C46551Dgt) this.A04.getValue()).A00();
    }

    public C14077TpR(C14078TpS tpS, C14336TuJ tuJ, C14389TvI tvI, C14390TvJ tvJ, VM9 vm9, C14082TpW tpW, C14083TpX tpX) {
        this.A00 = tpS;
        this.A07 = tpX;
        this.A03 = tpW;
        this.A05 = tvI;
        this.A06 = tvJ;
        this.A01 = tuJ;
        this.A02 = vm9;
    }
}
