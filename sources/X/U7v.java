package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;

public final class U7v extends Fragment implements X05, X07, X08, X09 {
    public int A00 = R.layout.preference_list_fragment;
    public C17915Vi6 A01;
    public RecyclerView A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05 = new C14697U1x(Looper.getMainLooper(), this, 0);
    public final C14812UAj A06 = new C14812UAj(this);
    public final Runnable A07 = new C19909Whe(this);

    public final void onSaveInstanceState(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.A01.A05;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.A09(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (preferenceScreen2 = this.A01.A05) == null)) {
            preferenceScreen2.A08(bundle2);
        }
        if (this.A03 && (preferenceScreen = this.A01.A05) != null) {
            this.A02.setAdapter(new UAT(preferenceScreen));
            preferenceScreen.A05();
        }
        this.A04 = true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(413364962);
        U7v.super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        C17915Vi6 vi6 = new C17915Vi6(requireContext());
        this.A01 = vi6;
        vi6.A03 = this;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        Context context = this.A01.A07;
        IGDevToolPersistentStateHandler iGDevToolPersistentStateHandler = new IGDevToolPersistentStateHandler(context, 09i.A0A.A08(context));
        PreferenceCategory preferenceCategory = new PreferenceCategory(context, (AttributeSet) null);
        preferenceCategory.A0F("Dev Options");
        C17915Vi6 vi62 = this.A01;
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, (AttributeSet) null);
        preferenceScreen.A0C(vi62);
        preferenceScreen.A0O(preferenceCategory);
        new C18550Vu2().A01(context, preferenceScreen, iGDevToolPersistentStateHandler);
        C17915Vi6 vi63 = this.A01;
        PreferenceScreen preferenceScreen2 = vi63.A05;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.A06();
            }
            vi63.A05 = preferenceScreen;
            this.A03 = true;
            if (this.A04) {
                Handler handler = this.A05;
                if (!handler.hasMessages(1)) {
                    handler.obtainMessage(1).sendToTarget();
                }
            }
        }
        AnonymousClass0fD.A09(1505441152, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        int i;
        int A022 = AnonymousClass0fD.A02(348633831);
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes((AttributeSet) null, C17166VKv.A07, R.attr.preferenceFragmentCompatStyle, 0);
        this.A00 = obtainStyledAttributes.getResourceId(0, this.A00);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.A00, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            if (!requireContext().getPackageManager().hasSystemFeature(C273654mx.A00(117)) || (recyclerView = C13990Tnq.A0G(viewGroup2)) == null) {
                recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
                DbY.A16(this, recyclerView);
                recyclerView.setAccessibilityDelegateCompat(new C14912UEu(recyclerView));
            }
            this.A02 = recyclerView;
            C14812UAj uAj = this.A06;
            recyclerView.A11(uAj);
            if (drawable != null) {
                i = drawable.getIntrinsicHeight();
            } else {
                i = 0;
            }
            uAj.A00 = i;
            uAj.A01 = drawable;
            U7v u7v = uAj.A03;
            u7v.A02.A0i();
            if (dimensionPixelSize != -1) {
                uAj.A00 = dimensionPixelSize;
                u7v.A02.A0i();
            }
            uAj.A02 = z;
            if (this.A02.getParent() == null) {
                viewGroup2.addView(this.A02);
            }
            this.A05.post(this.A07);
            AnonymousClass0fD.A09(-1331816327, A022);
            return inflate;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        AnonymousClass0fD.A09(1918416520, A022);
        throw illegalStateException;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2000382981);
        Handler handler = this.A05;
        handler.removeCallbacks(this.A07);
        handler.removeMessages(1);
        if (this.A03) {
            this.A02.setAdapter((2Rw) null);
            PreferenceScreen preferenceScreen = this.A01.A05;
            if (preferenceScreen != null) {
                preferenceScreen.A06();
            }
        }
        this.A02 = null;
        U7v.super.onDestroyView();
        AnonymousClass0fD.A09(1766876915, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1535691875);
        U7v.super.onStart();
        C17915Vi6 vi6 = this.A01;
        vi6.A04 = this;
        vi6.A02 = this;
        AnonymousClass0fD.A09(-1353802155, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1846209810);
        U7v.super.onStop();
        C17915Vi6 vi6 = this.A01;
        vi6.A04 = null;
        vi6.A02 = null;
        AnonymousClass0fD.A09(-1654715319, A022);
    }
}
