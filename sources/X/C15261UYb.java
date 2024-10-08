package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.AbsListView;
import com.instagram.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UYb  reason: case insensitive filesystem */
public final class C15261UYb extends C240383Kr {
    public C17442VVv A00;
    public U46 A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Vrk, X.Url, java.lang.Object] */
    public final Dialog A0F(Bundle bundle) {
        String str;
        Context context = getContext();
        if (context != null) {
            String str2 = this.A04;
            if (str2 == null) {
                str = "introToast";
            } else {
                String str3 = this.A03;
                if (str3 == null) {
                    str = "introButton";
                } else {
                    ArrayList arrayList = new ArrayList();
                    ? vrk = new C18441Vrk(C16524UwT.IMAGEBLOCK, "");
                    vrk.A01 = str2;
                    vrk.A00 = str3;
                    arrayList.add(vrk);
                    U46 u46 = new U46(context, arrayList);
                    this.A01 = u46;
                    u46.A01 = new WB0(this, 21);
                    Context context2 = getContext();
                    if (context2 != null) {
                        C358248ab r1 = new C358248ab(context2);
                        r1.A0r(true);
                        Dialog A022 = r1.A02();
                        A022.setContentView(R.layout.rapidfeedback_dialog_view);
                        WB0.A00(A022.findViewById(R.id.close_button), 20, this);
                        AbsListView absListView = (AbsListView) AnonymousClass7TF.A0F(A022.findViewById(R.id.rapidfeedback_page), R.id.rapidfeedback_page_list);
                        U46 u462 = this.A01;
                        if (u462 == null) {
                            str = "currentAdapter";
                        } else {
                            absListView.setAdapter(u462);
                            String str4 = this.A02;
                            if (str4 == null) {
                                str = "integrationPointId";
                            } else {
                                String str5 = this.A07;
                                if (str5 == null) {
                                    str = "surveyId";
                                } else {
                                    String str6 = this.A06;
                                    if (str6 == null) {
                                        str = "sessionBlob";
                                    } else {
                                        VI3.A00(AnonymousClass7TE.A0l(this.A08), AnonymousClass05K.A00, str4, str5, str6, (List) null);
                                        return A022;
                                    }
                                }
                            }
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(424100968);
        C15261UYb.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = C320236s2.A01(requireArguments, "ARG_TOAST_TEXT");
        this.A03 = C320236s2.A01(requireArguments, "ARG_INTRO_TOAST_BUTTON");
        this.A05 = C320236s2.A01(requireArguments, "ARG_OUTRO_TOAST_TEXT");
        this.A02 = C320236s2.A01(requireArguments, "ARG_INTEGRATION_POINT_ID");
        this.A07 = C320236s2.A01(requireArguments, "ARG_SURVEY_ID");
        this.A06 = C320236s2.A01(requireArguments, "ARG_SESSION_BLOB");
        try {
            this.A00 = C18207VnX.parseFromJson(16P.A00(C320236s2.A01(requireArguments, "ARG_SERIALIZED_MODEL_DATA")));
            AnonymousClass0fD.A09(-1200580557, A022);
        } catch (IOException e) {
            RuntimeException runtimeException = new RuntimeException(e);
            AnonymousClass0fD.A09(487521712, A022);
            throw runtimeException;
        }
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-807645346);
        C15261UYb.super.onResume();
        if (this.A07 == null) {
            A07();
        }
        AnonymousClass0fD.A09(1411324257, A022);
    }
}
