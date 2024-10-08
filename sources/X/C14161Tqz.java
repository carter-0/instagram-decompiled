package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState;
import androidx.appcompat.widget.Toolbar;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomappbar.BottomAppBar$SavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.navigation.NavigationBarView$SavedState;
import com.google.android.material.navigation.NavigationView$SavedState;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.Tqz  reason: case insensitive filesystem */
public final class C14161Tqz implements Parcelable.ClassLoaderCreator, Parcelable.Creator {
    public final int A00;

    public C14161Tqz(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.view.View$BaseSavedState, androidx.viewpager2.widget.ViewPager2$SavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v10, types: [java.lang.Object, androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                ? obj = new Object();
                obj.A00 = parcel.readInt();
                boolean A1U = Pxg.A1U(parcel);
                obj.A02 = A1U;
                if (!A1U) {
                    return obj;
                }
                obj.A01 = parcel.readBundle((ClassLoader) null);
                return obj;
            case 1:
                AbsSavedState absSavedState = new AbsSavedState(parcel, (ClassLoader) null);
                absSavedState.A00 = parcel.readInt();
                absSavedState.A01 = C41848B3p.A1X(parcel);
                return absSavedState;
            case 2:
                return new DrawerLayout.SavedState(parcel, (ClassLoader) null);
            case 3:
                AbsSavedState absSavedState2 = new AbsSavedState(parcel, (ClassLoader) null);
                absSavedState2.A01 = C41848B3p.A1X(parcel);
                absSavedState2.A00 = parcel.readInt();
                return absSavedState2;
            case 4:
                ? baseSavedState = new View.BaseSavedState(parcel, (ClassLoader) null);
                baseSavedState.A01 = parcel.readInt();
                baseSavedState.A00 = parcel.readInt();
                baseSavedState.A02 = parcel.readParcelable((ClassLoader) null);
                return baseSavedState;
            case 5:
                AbsSavedState absSavedState3 = new AbsSavedState(parcel, (ClassLoader) null);
                absSavedState3.A00 = parcel.readInt();
                absSavedState3.A01 = C41848B3p.A1X(parcel);
                return absSavedState3;
            case 6:
                return new BottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
            case 7:
                AbsSavedState absSavedState4 = new AbsSavedState(parcel, (ClassLoader) null);
                absSavedState4.getClass().getClassLoader();
                absSavedState4.A00 = Pxg.A1U(parcel);
                return absSavedState4;
            case 8:
                AbsSavedState absSavedState5 = new AbsSavedState(parcel, (ClassLoader) null);
                absSavedState5.A00 = Pxg.A1U(parcel);
                return absSavedState5;
            case 9:
                AbsSavedState absSavedState6 = new AbsSavedState(parcel, (ClassLoader) null);
                absSavedState6.A00 = parcel.readBundle(Pxf.A0W(absSavedState6));
                return absSavedState6;
            case 10:
                AbsSavedState absSavedState7 = new AbsSavedState(parcel, (ClassLoader) null);
                absSavedState7.A00 = parcel.readBundle((ClassLoader) null);
                return absSavedState7;
            default:
                return new TextInputLayout.SavedState(parcel, (ClassLoader) null);
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new AppCompatDelegateImpl$PanelFeatureState$SavedState[i];
            case 1:
                return new Toolbar.SavedState[i];
            case 2:
                return new DrawerLayout.SavedState[i];
            case 3:
                return new SlidingPaneLayout.SavedState[i];
            case 4:
                return new ViewPager2.SavedState[i];
            case 5:
                return new BottomAppBar$SavedState[i];
            case 6:
                return new BottomSheetBehavior.SavedState[i];
            case 7:
                return new MaterialButton.SavedState[i];
            case 8:
                return new CheckableImageButton.SavedState[i];
            case 9:
                return new NavigationBarView$SavedState[i];
            case 10:
                return new NavigationView$SavedState[i];
            default:
                return new TextInputLayout.SavedState[i];
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.view.View$BaseSavedState, androidx.viewpager2.widget.ViewPager2$SavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v10, types: [java.lang.Object, androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.A00) {
            case 0:
                ? obj = new Object();
                obj.A00 = parcel.readInt();
                boolean A1U = Pxg.A1U(parcel);
                obj.A02 = A1U;
                if (!A1U) {
                    return obj;
                }
                obj.A01 = parcel.readBundle(classLoader);
                return obj;
            case 1:
                AbsSavedState absSavedState = new AbsSavedState(parcel, classLoader);
                absSavedState.A00 = parcel.readInt();
                absSavedState.A01 = C41848B3p.A1X(parcel);
                return absSavedState;
            case 2:
                return new DrawerLayout.SavedState(parcel, classLoader);
            case 3:
                AbsSavedState absSavedState2 = new AbsSavedState(parcel, (ClassLoader) null);
                absSavedState2.A01 = C41848B3p.A1X(parcel);
                absSavedState2.A00 = parcel.readInt();
                return absSavedState2;
            case 4:
                ? baseSavedState = new View.BaseSavedState(parcel, classLoader);
                baseSavedState.A01 = parcel.readInt();
                baseSavedState.A00 = parcel.readInt();
                baseSavedState.A02 = parcel.readParcelable(classLoader);
                return baseSavedState;
            case 5:
                AbsSavedState absSavedState3 = new AbsSavedState(parcel, classLoader);
                absSavedState3.A00 = parcel.readInt();
                absSavedState3.A01 = C41848B3p.A1X(parcel);
                return absSavedState3;
            case 6:
                return new BottomSheetBehavior.SavedState(parcel, classLoader);
            case 7:
                AbsSavedState absSavedState4 = new AbsSavedState(parcel, classLoader);
                if (classLoader == null) {
                    absSavedState4.getClass().getClassLoader();
                }
                absSavedState4.A00 = Pxg.A1U(parcel);
                return absSavedState4;
            case 8:
                AbsSavedState absSavedState5 = new AbsSavedState(parcel, classLoader);
                absSavedState5.A00 = Pxg.A1U(parcel);
                return absSavedState5;
            case 9:
                AbsSavedState absSavedState6 = new AbsSavedState(parcel, classLoader);
                if (classLoader == null) {
                    classLoader = Pxf.A0W(absSavedState6);
                }
                absSavedState6.A00 = parcel.readBundle(classLoader);
                return absSavedState6;
            case 10:
                AbsSavedState absSavedState7 = new AbsSavedState(parcel, classLoader);
                absSavedState7.A00 = parcel.readBundle(classLoader);
                return absSavedState7;
            default:
                return new TextInputLayout.SavedState(parcel, classLoader);
        }
    }
}
