package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import kotlin.Deprecated;

public abstract class W11 {
    public static Field A00;

    public static final void A00(ListView listView) {
        0qQ.A0B(listView, 0);
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 0);
            int count = adapter.getCount();
            int i = 0;
            for (int i2 = 0; i2 < count; i2++) {
                View view = adapter.getView(i2, (View) null, listView);
                if (view != null) {
                    if (i2 == 0) {
                        C66581MXm.A1B(view, makeMeasureSpec, -2);
                    }
                    view.measure(makeMeasureSpec, 0);
                    i += view.getMeasuredHeight();
                }
            }
            ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = i + (listView.getDividerHeight() * (adapter.getCount() - 1));
            listView.setLayoutParams(layoutParams);
        }
    }

    static {
        try {
            Field declaredField = AdapterView.class.getDeclaredField("mDataChanged");
            A00 = declaredField;
            if (declaredField == null) {
                0qQ.A0F("dataChangedField");
                throw AnonymousClass00P.createAndThrow();
            } else {
                declaredField.setAccessible(true);
            }
        } catch (NoSuchFieldException unused) {
            if (Build.VERSION.SDK_INT < 29) {
                0wb.A03("failed_to_get_data_changed_list_view", "unable to find mDataChanged field on AdapterView");
            }
        }
    }

    public static final boolean A01() {
        return JTQ.A1P(Build.VERSION.SDK_INT, 29);
    }

    @Deprecated(message = "")
    public static final boolean A02(AdapterView adapterView) {
        Field field = A00;
        Boolean bool = null;
        if (field != null) {
            try {
                Object obj = field.get(adapterView);
                0qQ.A0C(obj, AnonymousClass000.A00(39));
                bool = (Boolean) obj;
            } catch (IllegalAccessException unused) {
            }
            if (bool == null || !bool.booleanValue()) {
                return true;
            }
            return false;
        }
        return true;
    }
}
