package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.util.ArrayList;
import java.util.List;

public final class LcN implements 2IR {
    public final int A00;
    public final Object A01;

    public LcN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                ((C60148JgT) this.A01).A02.Epw(C65002Llf.A00);
                return;
            case 1:
                C51968G9o.A1O((0sP) this.A01, false);
                return;
            default:
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        05G r1;
        Object obj2;
        SimpleImageUrl simpleImageUrl;
        SimpleImageUrl simpleImageUrl2;
        switch (this.A00) {
            case 0:
                List list = (List) obj;
                if (list != null) {
                    ArrayList<C60965JuN> A1C = AnonymousClass7TE.A1C();
                    for (Object next : list) {
                        if (((C60965JuN) next).A05) {
                            A1C.add(next);
                        }
                    }
                    if (!(!list.isEmpty()) || !A1C.isEmpty()) {
                        C60148JgT jgT = (C60148JgT) this.A01;
                        05G r3 = jgT.A02;
                        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
                        for (C60965JuN juN : A1C) {
                            String str = juN.A00;
                            if (str != null) {
                                simpleImageUrl = C253833rU.A00(DbT.A09(str), -1, -1);
                            } else {
                                simpleImageUrl = null;
                            }
                            String str2 = juN.A00;
                            if (str2 != null) {
                                simpleImageUrl2 = C253833rU.A00(DbT.A09(str2), -1, -1);
                            } else {
                                simpleImageUrl2 = null;
                            }
                            A0r.add(new C61050Jvo((ImageUrl) simpleImageUrl, (ImageUrl) simpleImageUrl2, juN, (C62320sa) new MJ9(23, juN, jgT), (C62320sa) new MJ9(24, juN, jgT)));
                        }
                        r3.Epw(new C61181Jya(A0r));
                        return;
                    }
                    r1 = ((C60148JgT) this.A01).A02;
                    obj2 = C64999Llc.A00;
                } else {
                    r1 = ((C60148JgT) this.A01).A02;
                    obj2 = C65000Lld.A00;
                }
                r1.Epw(obj2);
                return;
            case 1:
                C51968G9o.A1O((0sP) this.A01, DbX.A1a(obj));
                return;
            default:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                View view = editMediaInfoFragment.mCommentPromptLabelView;
                if (view != null) {
                    view.setVisibility(8);
                    editMediaInfoFragment.mCommentPromptLabelView = null;
                }
                IgAutoCompleteTextView igAutoCompleteTextView = editMediaInfoFragment.mCaption;
                if (igAutoCompleteTextView != null) {
                    igAutoCompleteTextView.setFocusableInTouchMode(true);
                    editMediaInfoFragment.mCaption.setOnClickListener((View.OnClickListener) null);
                    editMediaInfoFragment.mCaption.requestFocus();
                }
                1Xj r0 = editMediaInfoFragment.A0I;
                if (r0 != null) {
                    r0.A0C.ER6((C272054k1) null);
                }
                editMediaInfoFragment.A0j = true;
                EditMediaInfoFragment.A07(editMediaInfoFragment);
                return;
        }
    }
}
