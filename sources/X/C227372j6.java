package X;

import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.2j6  reason: invalid class name and case insensitive filesystem */
public final class C227372j6 implements C227182im {
    public final /* synthetic */ InstagramMainActivity A00;

    public C227372j6(InstagramMainActivity instagramMainActivity) {
        this.A00 = instagramMainActivity;
    }

    public final void DmH(int i, int i2) {
        InstagramMainActivity instagramMainActivity = this.A00;
        boolean z = false;
        if (C226112fe.A04 != -1) {
            z = true;
        }
        Object[] objArr = new Object[0];
        if (z) {
            instagramMainActivity.A00 = i;
            int i3 = C226112fe.A03;
            boolean z2 = false;
            if (i3 != -1) {
                z2 = true;
            }
            Object[] objArr2 = new Object[0];
            if (z2) {
                AnonymousClass2uJ.A00 = i3;
                AnonymousClass2uJ.A01 = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("The cached navigation bar height has not been initialized, use startListeningForStableStatusAndNavigationBarHeight() to receive a callback once this value is available", objArr2));
        }
        throw new IllegalArgumentException(String.format("The cached status bar height has not been initialized, use startListeningForStableStatusAndNavigationBarHeight() to receive a callback once this value is available", objArr));
    }
}
