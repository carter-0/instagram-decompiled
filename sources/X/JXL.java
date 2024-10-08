package X;

import com.instagram.creation.base.ui.mediatabbar.Tab;

public abstract class JXL {
    public static final Tab A00 = new Tab(2131962974, 0);
    public static final Tab A01 = new Tab(2131969399, 1);
    public static final Tab A02 = new Tab(2131976403, 2);

    public static final Tab A00(int i) {
        Tab tab = A00;
        if (i != 0) {
            tab = A01;
            if (i != 1) {
                tab = A02;
                if (i != 2) {
                    throw DbW.A0a("No tab which matches index ", i);
                }
            }
        }
        return tab;
    }
}
