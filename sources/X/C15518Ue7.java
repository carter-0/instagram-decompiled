package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Ue7  reason: case insensitive filesystem */
public final class C15518Ue7 extends C231632rz {
    public final UserSession A00;
    public final C230202p9 A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        0qQ.A0B(r3, 0);
        r3.A7U(1);
        r3.A7U(0);
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        IgdsButton igdsButton;
        int i3;
        int i4;
        View view2;
        Boolean bool;
        Object obj3 = obj2;
        Object obj4 = obj;
        int A03 = AnonymousClass0fD.A03(204331228);
        View view3 = view;
        AnonymousClass7TF.A1B(view3, 1, obj4);
        0qQ.A0B(obj3, 3);
        C17983VjL vjL = (C17983VjL) obj4;
        C17927ViI viI = (C17927ViI) obj3;
        int i5 = i;
        if (i == 0) {
            Context context = view3.getContext();
            Object tag = view3.getTag();
            0qQ.A0C(tag, AnonymousClass000.A00(3663));
            UE4 ue4 = (UE4) tag;
            C230202p9 r11 = this.A01;
            C17997VjZ A012 = vjL.A01(viI.A01);
            C15059UNc uNc = A012.A03;
            INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types = uNc.A00;
            if (inline_survey_question_types == INLINE_SURVEY_QUESTION_TYPES.COMMENT) {
                int i6 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                ue4.A02.setVisibility(8);
                String str = uNc.A05;
                EditText editText = (EditText) ue4.A04.A01();
                if (!TextUtils.isEmpty(str)) {
                    editText.setHint(str);
                }
                int i7 = 0;
                editText.setVisibility(0);
                editText.setText(A012.A00);
                String str2 = A012.A00;
                if (str2 != null) {
                    i7 = str2.length();
                }
                editText.setSelection(i7);
                editText.postDelayed(new C20025Wjl(ue4), 100);
                editText.setOnFocusChangeListener(new WBJ(1, A012, ue4));
                editText.setImeOptions(6);
                editText.setRawInputType(1);
                editText.setOnEditorActionListener(new WDB());
                boolean A1Y = AnonymousClass7TF.A1Y(uNc.A01, true);
                editText.removeTextChangedListener(ue4.A00);
                C71274OhF ohF = new C71274OhF(ue4, A012, A1Y);
                ue4.A00 = ohF;
                editText.addTextChangedListener(ohF);
            } else {
                W2c.A03(context, r11, ue4, vjL, A012, viI);
            }
            String str3 = uNc.A02;
            if (!TextUtils.isEmpty(str3)) {
                int i8 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                ((TextView) ue4.A05.A01()).setText(str3);
            }
            int i9 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            ue4.A05.A03(DbW.A00(TextUtils.isEmpty(str3) ? 1 : 0));
            boolean A1V = AnonymousClass7TF.A1V(vjL.A01);
            if (!AnonymousClass7TF.A1W(inline_survey_question_types, INLINE_SURVEY_QUESTION_TYPES.SINGLE) || (A012.A02 ? !((bool = vjL.A00.A03) == null || !bool.booleanValue()) : A012.A01)) {
                C71662eb r9 = ue4.A03;
                View A013 = r9.A01();
                String str4 = ue4.A01;
                boolean z = false;
                if (str4 == "v2" || str4 == "v3") {
                    IgdsButton igdsButton2 = ue4.A06;
                    igdsButton2.setVisibility(0);
                    Resources resources = context.getResources();
                    Boolean bool2 = vjL.A00.A03;
                    if (bool2 == null || !bool2.booleanValue() || (!A012.A02 && !A012.A01)) {
                        i2 = 2131968361;
                    } else {
                        i2 = 2131974836;
                    }
                    igdsButton2.setText(resources.getString(i2));
                    igdsButton = igdsButton2;
                } else {
                    r9.A03(0);
                    TextView textView = (TextView) r9.A01();
                    Resources resources2 = context.getResources();
                    Boolean bool3 = vjL.A00.A03;
                    if (bool3 == null || !bool3.booleanValue() || (!A012.A02 && !A012.A01)) {
                        i3 = 2131968361;
                    } else {
                        i3 = 2131974836;
                    }
                    DbU.A1A(resources2, textView, i3);
                    igdsButton = A013;
                }
                if (AnonymousClass7TF.A1Y(uNc.A01, true) || A012.A01()) {
                    z = true;
                }
                igdsButton.setActivated(z);
                AnonymousClass0fU.A00(new FOP(2, context, r11, A012, viI, vjL, A1V), igdsButton);
                AnonymousClass0fD.A0A(-587899250, A03);
            }
            i4 = 8;
            ue4.A03.A03(8);
            String str5 = ue4.A01;
            if (str5 == "v2" || str5 == "v3") {
                view2 = ue4.A06;
            }
            AnonymousClass0fD.A0A(-587899250, A03);
        } else if (i5 == 1) {
            Object tag2 = view3.getTag();
            0qQ.A0C(tag2, AnonymousClass000.A00(3662));
            C14907UEm uEm = (C14907UEm) tag2;
            C230202p9 r8 = this.A01;
            0qQ.A0B(uEm, 0);
            AnonymousClass7TF.A1B(vjL, 1, viI);
            0qQ.A0B(r8, 3);
            C17997VjZ A014 = vjL.A01(viI.A01);
            uEm.A01 = vjL;
            uEm.A00 = r8;
            if (!viI.A04) {
                viI.A04 = true;
                String str6 = A014.A03.A03;
                if (str6 != null) {
                    r8.Db8(str6, viI.A01);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            r8.Db7(vjL, A014);
            TextView textView2 = uEm.A07;
            String str7 = A014.A03.A07;
            if (str7 != null) {
                SpannableString spannableString = new SpannableString(str7);
                spannableString.setSpan(new CharacterStyle(), 0, spannableString.length(), 0);
                textView2.setText(spannableString);
                C42107BHk bHk = vjL.A00;
                boolean A1X = AnonymousClass7TG.A1X(bHk.A02);
                i4 = 8;
                View view4 = uEm.A04;
                if (A1X) {
                    WBG.A01(view4, 29, viI, uEm);
                    WBG.A01(uEm.A02, 30, viI, uEm);
                    uEm.A00(A014, viI);
                } else {
                    view4.setVisibility(8);
                    uEm.A02.setVisibility(8);
                }
                boolean A1X2 = AnonymousClass7TG.A1X(bHk.A01);
                TextView textView3 = uEm.A06;
                if (A1X2) {
                    textView3.setVisibility(0);
                    uEm.A01(A014, viI);
                } else {
                    textView3.setVisibility(8);
                }
                viI.A08.add(uEm);
                view2 = uEm.A03;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(AnonymousClass000.A00(33));
            AnonymousClass0fD.A0A(480548989, A03);
            throw unsupportedOperationException;
        }
        view2.setVisibility(i4);
        AnonymousClass0fD.A0A(-587899250, A03);
    }

    public C15518Ue7(UserSession userSession, C230202p9 r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A012;
        int A03 = AnonymousClass0fD.A03(1277682609);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            A012 = W2c.A01(viewGroup);
        } else if (i == 1) {
            A012 = C18719Vys.A00(viewGroup, this.A00, "v1");
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
            AnonymousClass0fD.A0A(-1809314992, A03);
            throw unsupportedOperationException;
        }
        AnonymousClass0fD.A0A(633714190, A03);
        return A012;
    }
}
