package androidx.drawerlayout.widget;

import X.C14161Tqz;
import X.C51856G4o;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;

public abstract class DrawerLayout extends ViewGroup {
    public abstract float getDrawerElevation();

    public abstract Drawable getStatusBarBackgroundDrawable();

    public abstract void setDrawerElevation(float f);

    @Deprecated
    public abstract void setDrawerListener(C51856G4o g4o);

    public abstract void setDrawerLockMode(int i);

    public abstract void setScrimColor(int i);

    public abstract void setStatusBarBackground(int i);

    public abstract void setStatusBarBackground(Drawable drawable);

    public abstract void setStatusBarBackgroundColor(int i);

    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C14161Tqz(2);
        public int A00;
        public int A01;
        public int A02;
        public int A03;
        public int A04;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.A04 = parcel.readInt();
            this.A01 = parcel.readInt();
            this.A02 = parcel.readInt();
            this.A03 = parcel.readInt();
            this.A00 = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            DrawerLayout.super.writeToParcel(parcel, i);
            parcel.writeInt(this.A04);
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A02);
            parcel.writeInt(this.A03);
            parcel.writeInt(this.A00);
        }
    }
}
