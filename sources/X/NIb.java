package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.Iterator;
import java.util.List;

public final class NIb extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "MetaAiHcmSourcesBottomSheetFragment";
    public C56023HrV A00;
    public C67408MnP A01;
    public List A02;
    public String A03;
    public List A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final X47 A06 = new C72688PFs(this, 0);

    public final String getModuleName() {
        return "meta_ai_hcm_sources_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0c = JTR.A0c(view, R.id.list);
        int i = 0;
        DbU.A15(requireContext(), A0c, 1, false);
        AnonymousClass2t9 A0U = DbU.A0U(DbV.A0S(this), new C68629NPz(requireContext(), AnonymousClass7TE.A0l(this.A05), this.A00));
        ViewModelListUpdate A0R = DbS.A0R();
        List list = this.A02;
        String str = "searchResultUriList";
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        List list2 = this.A04;
                        if (list2 != null) {
                            String A19 = AnonymousClass7TE.A19(list2, i);
                            List list3 = this.A02;
                            if (list3 == null) {
                                break;
                            }
                            String A192 = AnonymousClass7TE.A19(list3, i);
                            String str2 = this.A03;
                            if (str2 == null) {
                                str = "botResponseId";
                                break;
                            } else {
                                A0R.A00(new N61(A19, A192, str2, i2));
                                i = i2;
                            }
                        } else {
                            str = "referencesTitleList";
                            break;
                        }
                    } else {
                        0sr.A1T();
                        break;
                    }
                } else {
                    A0U.A05(A0R);
                    A0c.setAdapter(A0U);
                    X47 x47 = this.A06;
                    if (x47 != null) {
                        List list4 = this.A02;
                        if (list4 != null) {
                            x47.EBK(A0c, list4);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(482087826);
        NIb.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        0sn stringArrayList = requireArguments.getStringArrayList("search_result_uri");
        if (stringArrayList == null) {
            stringArrayList = 0sn.A00;
        }
        this.A02 = stringArrayList;
        0sn stringArrayList2 = requireArguments.getStringArrayList("references_title");
        if (stringArrayList2 == null) {
            stringArrayList2 = 0sn.A00;
        }
        this.A04 = stringArrayList2;
        String string = requireArguments.getString("bot_response_id");
        if (string == null) {
            string = "";
        }
        this.A03 = string;
        AnonymousClass0fD.A09(1176420681, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1852242176);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_meta_ai_hcm_sources_bottom_sheet, false);
        AnonymousClass0fD.A09(-415403074, A022);
        return A0D;
    }
}
