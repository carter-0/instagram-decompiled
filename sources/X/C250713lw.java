package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGCTAStickerPositioningStrategyEnum;

/* renamed from: X.3lw  reason: invalid class name and case insensitive filesystem */
public final class C250713lw extends AnonymousClass0T0 implements C250723lx {
    public final C250703lv A00;
    public final IGCTAStickerPositioningStrategyEnum A01;
    public final Boolean A02;
    public final Boolean A03;

    public final C250713lw F3v() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C250713lw) {
                C250713lw r5 = (C250713lw) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C250703lv r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        Boolean bool = this.A02;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A03;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum = this.A01;
        if (iGCTAStickerPositioningStrategyEnum != null) {
            i = iGCTAStickerPositioningStrategyEnum.hashCode();
        }
        return hashCode3 + i;
    }

    public final C250703lv Auw() {
        return this.A00;
    }

    public final Boolean BZi() {
        return this.A02;
    }

    public final Boolean BZj() {
        return this.A03;
    }

    public final IGCTAStickerPositioningStrategyEnum CAO() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdsCTAStickerInfoDict", C44172CYl.A00(this));
    }

    public C250713lw(C250703lv r1, IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum, Boolean bool, Boolean bool2) {
        this.A00 = r1;
        this.A02 = bool;
        this.A03 = bool2;
        this.A01 = iGCTAStickerPositioningStrategyEnum;
    }
}
