package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AppreciationUFIEntryActionType;

/* renamed from: X.5AU  reason: invalid class name */
public final class AnonymousClass5AU extends AnonymousClass0T0 implements AnonymousClass5AV {
    public final int A00;
    public final AppreciationUFIEntryActionType A01;

    public AnonymousClass5AU(AppreciationUFIEntryActionType appreciationUFIEntryActionType, int i) {
        0qQ.A0B(appreciationUFIEntryActionType, 1);
        this.A01 = appreciationUFIEntryActionType;
        this.A00 = i;
    }

    public final AnonymousClass5AU F0W() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5AU) {
                AnonymousClass5AU r5 = (AnonymousClass5AU) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public final /* bridge */ /* synthetic */ C45331CuZ AK7() {
        return new C45331CuZ(this);
    }

    public final AppreciationUFIEntryActionType AYW() {
        return this.A01;
    }

    public final int B9I() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAppreciationUFIEntryObject", CUY.A00(this));
    }
}
