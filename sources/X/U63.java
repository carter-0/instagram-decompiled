package X;

import android.content.res.ColorStateList;
import com.instagram.android.R;

public final class U63 extends U4J {
    public static final int[][] A02 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public boolean A00;
    public ColorStateList A01;

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.A01;
        if (colorStateList != null) {
            return colorStateList;
        }
        int[][] iArr = A02;
        int A012 = C298035sl.A01(this, R.attr.colorControlActivated);
        int A013 = C298035sl.A01(this, R.attr.colorSurface);
        int A014 = C298035sl.A01(this, R.attr.colorOnSurface);
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{C18108Vlc.A00(1.0f, A013, A012), C18108Vlc.A00(0.54f, A013, A014), C18108Vlc.A00(0.38f, A013, A014), C18108Vlc.A00(0.38f, A013, A014)});
        this.A01 = colorStateList2;
        return colorStateList2;
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.A00 = z;
        if (z) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        setButtonTintList(colorStateList);
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-1262754598);
        super.onAttachedToWindow();
        if (this.A00 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
        AnonymousClass0fD.A0D(1972891852, A06);
    }
}
