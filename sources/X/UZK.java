package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class UZK extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromotePreviewTemplateSelectionFragment";
    public WGU A00;
    public List A01;
    public C15478UdT A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "promote_preview_template_selection_fragment";
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [X.0rm, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        C13991Tnr.A0w(this);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A03);
        0hq r2 = this.mFragmentManager;
        if (r2 != null) {
            this.A02 = new C15478UdT(requireContext, r2, A0l);
            RecyclerView A0G = C13990Tnq.A0G(view2);
            C15478UdT udT = this.A02;
            String str = "viewAdapter";
            if (udT != null) {
                A0G.setAdapter(udT);
                DbV.A1B(getContext(), A0G);
                C15478UdT udT2 = this.A02;
                if (udT2 != null) {
                    udT2.A00.clear();
                    udT2.clear();
                    ? obj2 = new Object();
                    ? obj3 = new Object();
                    List list = this.A01;
                    if (list != null) {
                        int size = list.size();
                        int i = 0;
                        String str2 = null;
                        SimpleImageUrl simpleImageUrl = null;
                        boolean z = false;
                        while (true) {
                            if (i < size) {
                                List list2 = this.A01;
                                if (list2 == null) {
                                    break;
                                }
                                C16658Uyu uyu = ((C17485VXm) list2.get(i)).A00;
                                if (uyu != null) {
                                    int ordinal = uyu.ordinal();
                                    if (ordinal != 1) {
                                        if (ordinal == 3) {
                                            List list3 = this.A01;
                                            if (list3 == null) {
                                                break;
                                            }
                                            String str3 = ((C17485VXm) list3.get(i)).A03;
                                            if (str3 != null) {
                                                simpleImageUrl = new SimpleImageUrl(str3);
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        } else if (ordinal == 2) {
                                            z = true;
                                        }
                                    } else {
                                        List list4 = this.A01;
                                        if (list4 == null) {
                                            break;
                                        }
                                        obj3.A00 = ((C17485VXm) list4.get(i)).A03;
                                        List list5 = this.A01;
                                        if (list5 == null) {
                                            break;
                                        }
                                        obj2.A00 = ((C17485VXm) list5.get(i)).A02;
                                        List list6 = this.A01;
                                        if (list6 == null) {
                                            break;
                                        }
                                        str2 = ((C17485VXm) list6.get(i)).A01;
                                    }
                                }
                                i++;
                            } else {
                                if (!(obj3.A00 == null || (obj = obj2.A00) == null || simpleImageUrl == null)) {
                                    C15478UdT udT3 = this.A02;
                                    if (udT3 != null) {
                                        CharSequence charSequence = (CharSequence) obj;
                                        udT3.A00.add(new C17570VaO(new WB4(12, obj2, obj3, this), this, simpleImageUrl, charSequence, str2, AnonymousClass05K.A0C));
                                    }
                                }
                                List list7 = this.A01;
                                if (list7 != null) {
                                    int size2 = list7.size();
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= size2) {
                                            C15478UdT udT4 = this.A02;
                                            if (udT4 != null) {
                                                udT4.A01();
                                                WGU wgu = this.A00;
                                                if (wgu == null) {
                                                    str = "logger";
                                                } else {
                                                    C13988Tno.A1J(wgu, C16678UzE.AD_PREVIEW_TEMPLATE_SELECTION);
                                                    return;
                                                }
                                            }
                                        } else {
                                            if (z) {
                                                C15478UdT udT5 = this.A02;
                                                if (udT5 == null) {
                                                    break;
                                                }
                                                Integer num = AnonymousClass05K.A01;
                                                C15478UdT.A00(udT5, num);
                                                C15478UdT udT6 = this.A02;
                                                if (udT6 == null) {
                                                    break;
                                                }
                                                Integer num2 = AnonymousClass05K.A00;
                                                udT6.A00.add(new C17570VaO(C18880WAs.A00, this, (ImageUrl) null, AnonymousClass7TE.A16(requireContext(), 2131970684), (CharSequence) null, num2));
                                                C15478UdT udT7 = this.A02;
                                                if (udT7 == null) {
                                                    break;
                                                }
                                                udT7.A00.add(new C17570VaO(C18881WAt.A00, this, (ImageUrl) null, AnonymousClass7TE.A16(requireContext(), 2131970685), (CharSequence) null, num));
                                                z = false;
                                            }
                                            List list8 = this.A01;
                                            if (list8 == null) {
                                                break;
                                            }
                                            C16658Uyu uyu2 = ((C17485VXm) list8.get(i2)).A00;
                                            if (uyu2 != null && uyu2.ordinal() == 2) {
                                                C15478UdT udT8 = this.A02;
                                                if (udT8 == null) {
                                                    break;
                                                }
                                                Integer num3 = AnonymousClass05K.A0N;
                                                List list9 = this.A01;
                                                if (list9 == null) {
                                                    break;
                                                }
                                                String str4 = ((C17485VXm) list9.get(i2)).A02;
                                                if (str4 != null) {
                                                    udT8.A00.add(new C17570VaO(new WB1(this, i2, 1), this, (ImageUrl) null, str4, (CharSequence) null, num3));
                                                } else {
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    0qQ.A0F("listOfPreviewInfo");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131970642);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        List list;
        int A022 = AnonymousClass0fD.A02(-782051116);
        UZK.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str2 = null;
        if (bundle2 != null) {
            str = bundle2.getString("instagram_positions");
        } else {
            str = null;
        }
        V70.A00(String.valueOf(str));
        Gson gson = new Gson();
        Type type = new R1a().A00;
        0qQ.A07(type);
        try {
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                str2 = bundle3.getString("preview_info");
            }
            list = (List) gson.A09(String.valueOf(str2), type);
        } catch (AnonymousClass1Aw unused) {
            list = new ArrayList();
        }
        this.A01 = list;
        this.A00 = JTU.A0D(this.A03);
        AnonymousClass0fD.A09(-1255945455, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(561437411);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_fragment, false);
        AnonymousClass0fD.A09(1734540803, A022);
        return A0D;
    }
}
