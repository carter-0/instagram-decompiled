package org.webrtc;

import X.002;

public class Size {
    public int height;
    public int width;

    public boolean equals(Object obj) {
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        if (this.width == size.width && this.height == size.height) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.width * 65537) + 1 + this.height;
    }

    public String toString() {
        return 002.A0P("x", this.width, this.height);
    }

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
