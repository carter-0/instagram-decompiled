package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

public final class IDY implements View.OnTouchListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public IDY(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        CompoundButton compoundButton;
        switch (this.A00) {
            case 0:
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                IgdsRadioButton igdsRadioButton = ((C55880Hp1) this.A01).A08;
                if (igdsRadioButton.isChecked()) {
                    return true;
                }
                ViewGroup viewGroup = (ViewGroup) this.A02;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof RoundedCornerConstraintLayout) && (compoundButton = (CompoundButton) childAt.findViewById(R.id.row_threads_in_stories_report_radio_button)) != null && compoundButton.isChecked()) {
                        compoundButton.setChecked(false);
                    }
                }
                igdsRadioButton.setChecked(true);
                C62320sa r0 = (C62320sa) this.A03;
                if (r0 == null) {
                    return true;
                }
                r0.invoke();
                return true;
            case 1:
                ((GestureDetector) this.A02).onTouchEvent(motionEvent);
                int action = motionEvent.getAction();
                if (action != 1 && action != 3) {
                    return true;
                }
                C317576nU r1 = (C317576nU) this.A01;
                r1.DiC();
                if (((C317046md) this.A03).A01) {
                    return true;
                }
                r1.DiB();
                return true;
            default:
                ((GestureDetector) this.A02).onTouchEvent(motionEvent);
                int action2 = motionEvent.getAction();
                if (action2 != 1 && action2 != 3) {
                    return true;
                }
                C317576nU r12 = (C317576nU) this.A01;
                r12.DiC();
                if (((C317046md) this.A03).A01) {
                    return true;
                }
                r12.Di9();
                return true;
        }
    }
}
