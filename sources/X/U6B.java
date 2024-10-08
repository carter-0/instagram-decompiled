package X;

import android.content.res.ColorStateList;
import com.instagram.android.R;

public final class U6B extends U5W {
    public static final int[][] A02 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public boolean A00;
    public ColorStateList A01;

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.A01;
        if (colorStateList != null) {
            return colorStateList;
        }
        int A012 = C298035sl.A01(this, R.attr.colorControlActivated);
        int A013 = C298035sl.A01(this, R.attr.colorOnSurface);
        int A014 = C298035sl.A01(this, R.attr.colorSurface);
        ColorStateList colorStateList2 = new ColorStateList(A02, new int[]{C18108Vlc.A00(1.0f, A014, A012), C18108Vlc.A00(0.54f, A014, A013), C18108Vlc.A00(0.38f, A014, A013), C18108Vlc.A00(0.38f, A014, A013)});
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
        int A06 = AnonymousClass0fD.A06(-699965372);
        super.onAttachedToWindow();
        if (this.A00 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
        AnonymousClass0fD.A0D(-1503073769, A06);
    }
}
