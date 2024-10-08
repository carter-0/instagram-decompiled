package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.4Rn  reason: invalid class name and case insensitive filesystem */
public final class C264844Rn {
    public static final C264844Rn A03 = new C264844Rn(new C264854Ro[0]);
    public int A00;
    public final int A01;
    public final ImmutableList A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C264844Rn r5 = (C264844Rn) obj;
            if (this.A01 != r5.A01 || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = this.A02.hashCode();
        this.A00 = hashCode;
        return hashCode;
    }

    public C264844Rn(C264854Ro... r8) {
        this.A02 = ImmutableList.copyOf((Object[]) r8);
        this.A01 = r8.length;
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.A02;
            if (i < immutableList.size()) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < immutableList.size(); i3++) {
                    if (immutableList.get(i).equals(immutableList.get(i3))) {
                        2AG.A05("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }
}
