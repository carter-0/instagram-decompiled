package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.api.schemas.LiveUserPaySupportTier;

/* renamed from: X.4wG  reason: invalid class name and case insensitive filesystem */
public final class C278094wG extends AnonymousClass0T0 implements C278104wH {
    public final IGLiveBadgeSettings A00;
    public final LiveUserPaySupportTier A01;
    public final C2816658x A02;
    public final Boolean A03;
    public final Integer A04;

    public final C278094wG F5a() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C278094wG) {
                C278094wG r5 = (C278094wG) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        IGLiveBadgeSettings iGLiveBadgeSettings = this.A00;
        int i = 0;
        int hashCode = (iGLiveBadgeSettings == null ? 0 : iGLiveBadgeSettings.hashCode()) * 31;
        Integer num = this.A04;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.A03;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        C2816658x r0 = this.A02;
        int hashCode4 = (hashCode3 + (r0 == null ? 0 : r0.hashCode())) * 31;
        LiveUserPaySupportTier liveUserPaySupportTier = this.A01;
        if (liveUserPaySupportTier != null) {
            i = liveUserPaySupportTier.hashCode();
        }
        return hashCode4 + i;
    }

    public final IGLiveBadgeSettings Af4() {
        return this.A00;
    }

    public final Integer Af5() {
        return this.A04;
    }

    public final Boolean BP6() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ C2816758y Bav() {
        return this.A02;
    }

    public final LiveUserPaySupportTier CFE() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLiveUserPayViewerConfig", C63021KqC.A00(this));
    }

    public C278094wG(IGLiveBadgeSettings iGLiveBadgeSettings, LiveUserPaySupportTier liveUserPaySupportTier, C2816658x r3, Boolean bool, Integer num) {
        this.A00 = iGLiveBadgeSettings;
        this.A04 = num;
        this.A03 = bool;
        this.A02 = r3;
        this.A01 = liveUserPaySupportTier;
    }
}
