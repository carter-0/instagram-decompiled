package androidx.appcompat.app;

import X.01c;
import X.0qQ;
import X.2Wz;
import X.2X0;
import X.2X1;
import X.2X4;
import X.2X8;
import X.2Yd;
import X.AnonymousClass0fD;
import X.AnonymousClass2X7;
import X.AnonymousClass2Yl;
import X.C11538Sbz;
import X.C14708U2s;
import X.C16747V4e;
import X.C249423jl;
import X.C249433jm;
import X.C45975DHe;
import X.C71362ch;
import X.C71372cj;
import X.TZT;
import X.U5m;
import X.U5n;
import X.V4T;
import X.X8B;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.instagram.android.R;
import java.util.ArrayList;

public abstract class AppCompatActivity extends FragmentActivity implements C249423jl, C249433jm {
    public static final String DELEGATE_TAG = "androidx:appcompat";
    public 2X1 mDelegate;
    public Resources mResources;

    public void onLocalesChanged(2Yd r1) {
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(C45975DHe dHe) {
    }

    public void onSupportActionModeFinished(V4T v4t) {
    }

    public void onSupportActionModeStarted(V4T v4t) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public V4T onWindowStartingSupportActionMode(X8B x8b) {
        return null;
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    private void initDelegate() {
        this.savedStateRegistryController.A01.A03(new 2Wz(this), DELEGATE_TAG);
        addOnContextAvailableListener(new 2X0(this));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, X.3jl, java.lang.Object, androidx.appcompat.app.AppCompatActivity] */
    public 2X1 getDelegate() {
        2X1 r0 = this.mDelegate;
        if (r0 != null) {
            return r0;
        }
        int i = 2X1.A00;
        2X4 r02 = new 2X4(this, (Window) null, this, this);
        this.mDelegate = r02;
        return r02;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.ContextThemeWrapper, androidx.appcompat.app.AppCompatActivity] */
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            return AppCompatActivity.super.getResources();
        }
        return resources;
    }

    public void onContentChanged() {
    }

    public void onCreateSupportNavigateUpTaskStack(C45975DHe dHe) {
        throw new NullPointerException("addParentStack");
    }

    public AppCompatActivity() {
        initDelegate();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, X.0g9, X.07g, java.lang.Object, androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    private void initViewTreeOwners() {
        C71362ch.A01(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.A01(getWindow().getDecorView(), this);
        C71372cj.A01(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        0qQ.A0B(decorView, 0);
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().A0N(view, layoutParams);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public void attachBaseContext(Context context) {
        AppCompatActivity.super.attachBaseContext(getDelegate().A0G(context));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public void closeOptionsMenu() {
        2X4 delegate = getDelegate();
        2X4.A0D(delegate);
        C16747V4e v4e = delegate.A0E;
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (v4e == null || !v4e.A0F()) {
            AppCompatActivity.super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        2X4 delegate = getDelegate();
        2X4.A0D(delegate);
        C16747V4e v4e = delegate.A0E;
        if (keyCode != 82 || v4e == null || !(v4e instanceof U5m)) {
            return AppCompatActivity.super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            v4e.A0I();
        }
        return true;
    }

    public View findViewById(int i) {
        2X4 delegate = getDelegate();
        2X4.A0C(delegate);
        return delegate.A0A.findViewById(i);
    }

    public TZT getDrawerToggleDelegate() {
        return new C11538Sbz(getDelegate());
    }

    public MenuInflater getMenuInflater() {
        Context context;
        2X4 delegate = getDelegate();
        MenuInflater menuInflater = delegate.A07;
        if (menuInflater != null) {
            return menuInflater;
        }
        2X4.A0D(delegate);
        C16747V4e v4e = delegate.A0E;
        if (v4e != null) {
            context = v4e.A03();
        } else {
            context = delegate.A0l;
        }
        C14708U2s u2s = new C14708U2s(context);
        delegate.A07 = u2s;
        return u2s;
    }

    public C16747V4e getSupportActionBar() {
        2X4 delegate = getDelegate();
        2X4.A0D(delegate);
        return delegate.A0E;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public Intent getSupportParentActivityIntent() {
        return AnonymousClass2Yl.A00(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().A0I();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [androidx.activity.ComponentActivity, android.view.ContextThemeWrapper, androidx.appcompat.app.AppCompatActivity] */
    public void onConfigurationChanged(Configuration configuration) {
        AppCompatActivity.super.onConfigurationChanged(configuration);
        2X4 delegate = getDelegate();
        if (delegate.A0Y && delegate.A0e) {
            2X4.A0D(delegate);
            C16747V4e v4e = delegate.A0E;
            if (v4e != null) {
                v4e.A05();
            }
        }
        AnonymousClass2X7 A01 = AnonymousClass2X7.A01();
        Context context = delegate.A0l;
        synchronized (A01) {
            2X8 r1 = A01.A00;
            synchronized (r1) {
                01c r0 = (01c) r1.A04.get(context);
                if (r0 != null) {
                    r0.A07();
                }
            }
        }
        delegate.A04 = new Configuration(context.getResources().getConfiguration());
        2X4.A0E(delegate, false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(AppCompatActivity.super.getResources().getConfiguration(), AppCompatActivity.super.getResources().getDisplayMetrics());
        }
    }

    public void onDestroy() {
        int A00 = AnonymousClass0fD.A00(-112121549);
        AppCompatActivity.super.onDestroy();
        getDelegate().A0J();
        AnonymousClass0fD.A07(160187004, A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return AppCompatActivity.super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (AppCompatActivity.super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        2X4 delegate = getDelegate();
        2X4.A0D(delegate);
        C16747V4e v4e = delegate.A0E;
        if (menuItem.getItemId() != 16908332 || v4e == null || (v4e.A02() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public boolean onMenuOpened(int i, Menu menu) {
        return AppCompatActivity.super.onMenuOpened(i, menu);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public void onPostCreate(Bundle bundle) {
        AppCompatActivity.super.onPostCreate(bundle);
        2X4.A0C(getDelegate());
    }

    public void onPostResume() {
        AppCompatActivity.super.onPostResume();
        2X4 delegate = getDelegate();
        2X4.A0D(delegate);
        C16747V4e v4e = delegate.A0E;
        if (v4e != null) {
            v4e.A0E(true);
        }
    }

    public void onStart() {
        int A00 = AnonymousClass0fD.A00(-1109923859);
        AppCompatActivity.super.onStart();
        2X4.A0E(getDelegate(), true, false);
        AnonymousClass0fD.A07(476223630, A00);
    }

    public void onStop() {
        int A00 = AnonymousClass0fD.A00(-200454610);
        AppCompatActivity.super.onStop();
        2X4 delegate = getDelegate();
        2X4.A0D(delegate);
        C16747V4e v4e = delegate.A0E;
        if (v4e != null) {
            v4e.A0E(false);
        }
        AnonymousClass0fD.A07(-1510167227, A00);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, android.content.ContextWrapper, androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public boolean onSupportNavigateUp() {
        Intent intent;
        Intent A00 = AnonymousClass2Yl.A00(this);
        if (A00 == null) {
            return false;
        }
        if (shouldUpRecreateTask(A00)) {
            ArrayList arrayList = new ArrayList();
            if (((this instanceof C249433jm) && (intent = AnonymousClass2Yl.A00(this)) != null) || (intent = AnonymousClass2Yl.A00(this)) != null) {
                ComponentName component = intent.getComponent();
                if (component == null) {
                    component = intent.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent A01 = AnonymousClass2Yl.A01(component, this);
                    while (A01 != null) {
                        arrayList.add(size, A01);
                        A01 = AnonymousClass2Yl.A01(A01.getComponent(), this);
                    }
                    arrayList.add(intent);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                startActivities(intentArr, (Bundle) null);
                try {
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(A00);
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public void onTitleChanged(CharSequence charSequence, int i) {
        AppCompatActivity.super.onTitleChanged(charSequence, i);
        getDelegate().A0P(charSequence);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public void openOptionsMenu() {
        2X4 delegate = getDelegate();
        2X4.A0D(delegate);
        C16747V4e v4e = delegate.A0E;
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (v4e == null || !v4e.A0I()) {
            AppCompatActivity.super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        initViewTreeOwners();
        getDelegate().A0K(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        2X4 delegate = getDelegate();
        Object obj = delegate.A0n;
        if (obj instanceof Activity) {
            2X4.A0D(delegate);
            C16747V4e v4e = delegate.A0E;
            if (!(v4e instanceof U5n)) {
                delegate.A07 = null;
                if (v4e != null) {
                    v4e.A06();
                }
                delegate.A0E = null;
                if (toolbar != null) {
                    U5m u5m = new U5m(delegate.A0F, toolbar, ((Activity) obj).getTitle());
                    delegate.A0E = u5m;
                    delegate.A0F.A00 = u5m.A05;
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    delegate.A0F.A00 = null;
                }
                delegate.A0I();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public void setTheme(int i) {
        AppCompatActivity.super.setTheme(i);
        getDelegate().A03 = i;
    }

    public V4T startSupportActionMode(X8B x8b) {
        return getDelegate().A0H(x8b);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().A0I();
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().A0Q(i);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public void onPanelClosed(int i, Menu menu) {
        AppCompatActivity.super.onPanelClosed(i, menu);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().A0O(view, layoutParams);
    }

    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().A0M(view);
    }
}
