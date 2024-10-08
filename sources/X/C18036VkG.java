package X;

/* renamed from: X.VkG  reason: case insensitive filesystem */
public final class C18036VkG {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18036VkG) {
                C18036VkG vkG = (C18036VkG) obj;
                if (!(this.A00 == vkG.A00 && this.A01 == vkG.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public final String toString() {
        return 002.A0X("Key(nextAudioStartTime=", ", nextBeatStartIndex=", ')', this.A00, this.A01);
    }

    public C18036VkG(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
