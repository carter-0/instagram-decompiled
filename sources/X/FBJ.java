package X;

import android.app.Activity;

public final class FBJ {
    public static final FBJ A02 = new Object();
    public C51864G4y A00;
    public C51912G7g A01;

    public final void A00(Activity activity, C51912G7g g7g, Boolean bool) {
        C51864G4y g4y;
        C51864G4y g4y2;
        11Z.A00();
        activity.getClass();
        11Z.A00();
        if (!(this.A01 == null || (g4y = this.A00) == null || !((C46663Dir) g4y).A03.get())) {
            11Z.A00();
            11Z.A00();
            if (!(this.A01 == null || (g4y2 = this.A00) == null || !((C46663Dir) g4y2).A03.get())) {
                if (this.A01 != null) {
                    this.A01 = null;
                }
                C51864G4y g4y3 = this.A00;
                if (g4y3 != null && ((C46663Dir) g4y3).A03.get()) {
                    C46663Dir.A00((C46663Dir) this.A00);
                    this.A00 = null;
                }
            }
        }
        this.A01 = g7g;
        1WP instance = 1WP.getInstance();
        if (instance != null && 0oI.A0C(activity)) {
            C51864G4y listenForSmsResponse = instance.listenForSmsResponse(activity, true);
            this.A00 = listenForSmsResponse;
            ((C46663Dir) listenForSmsResponse).A00 = new C50538Fdy(activity, g7g, this, bool);
        }
    }
}
