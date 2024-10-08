package X;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WqQ  reason: case insensitive filesystem */
public final class C20384WqQ implements Iterator {
    public int A00;
    public final int A01 = 0;
    public final Object A02;

    public C20384WqQ(List list) {
        this.A02 = list;
        this.A00 = 0;
    }

    public final boolean hasNext() {
        int i;
        int i2 = this.A01;
        int i3 = this.A00;
        if (i2 != 0) {
            i = ((List) this.A02).size();
        } else {
            i = ((C19879Wh8) this.A02).A03;
        }
        return AnonymousClass7TF.A1T(i3, i);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.A01 != 0) {
            int i = this.A00;
            this.A00 = i + 1;
            return new ModuleHolder((NativeModule) ((List) this.A02).get(i));
        }
        C19876Wh5[] wh5Arr = ((C19879Wh8) this.A02).A07;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        return wh5Arr[i2].A04;
    }

    public final void remove() {
        if (this.A01 != 0) {
            throw new UnsupportedOperationException("Cannot remove methods ");
        }
        throw new UnsupportedOperationException();
    }

    public C20384WqQ(C19879Wh8 wh8) {
        this.A02 = wh8;
        this.A00 = 0;
    }
}
