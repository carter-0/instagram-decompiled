package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: X.3n1  reason: invalid class name and case insensitive filesystem */
public final class C251383n1 extends ContextWrapper {
    public static Configuration A05;
    public int A00;
    public Configuration A01;
    public Resources A02;
    public Resources.Theme A03;
    public LayoutInflater A04;

    private void A00() {
        if (this.A03 == null) {
            this.A03 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.A03.setTo(theme);
            }
        }
        this.A03.applyStyle(this.A00, true);
    }

    public final void A01(Configuration configuration) {
        if (this.A02 != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.A01 == null) {
            this.A01 = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public final Resources getResources() {
        Resources resources = this.A02;
        if (resources == null) {
            Configuration configuration = this.A01;
            if (configuration != null) {
                Configuration configuration2 = A05;
                if (configuration2 == null) {
                    configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    A05 = configuration2;
                }
                if (!configuration.equals(configuration2)) {
                    resources = createConfigurationContext(this.A01).getResources();
                    this.A02 = resources;
                }
            }
            resources = super.getResources();
            this.A02 = resources;
        }
        return resources;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.A04;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater cloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        this.A04 = cloneInContext;
        return cloneInContext;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.A03;
        if (theme != null) {
            return theme;
        }
        if (this.A00 == 0) {
            this.A00 = 2132018357;
        }
        A00();
        return this.A03;
    }

    public final void setTheme(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            A00();
        }
    }

    public C251383n1(Context context, int i) {
        super(context);
        this.A00 = i;
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public C251383n1(Context context, Resources.Theme theme) {
        super(context);
        this.A03 = theme;
    }

    public C251383n1() {
        super((Context) null);
    }
}
