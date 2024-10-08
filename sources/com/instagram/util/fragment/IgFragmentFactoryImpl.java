package com.instagram.util.fragment;

import X.0qQ;
import X.F3W;
import android.os.Bundle;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;

@Deprecated
public final class IgFragmentFactoryImpl {
    public static IgFragmentFactoryImpl A00;

    public final GenericSurveyFragment A01(Integer num, String str, String str2, String str3) {
        GenericSurveyFragment genericSurveyFragment = new GenericSurveyFragment();
        Bundle bundle = new Bundle();
        bundle.putString("GenericSurveyFragment.SURVEY_TYPE", str);
        bundle.putString("GenericSurveyFragment.EXTRA_DATA_TOKEN", str2);
        bundle.putString("GenericSurveyFragment.ARGUMENTS_TRACKING_TOKEN", str3);
        bundle.putString("GenericSurveyFragment.ARGUMENTS_PARENT_MEDIA_ID", (String) null);
        if (num != null) {
            bundle.putInt("GenericSurveyFragment.ARGUMENTS_BLOKS_GENERIC_SURVEY_DELEGATE_KEY", num.intValue());
        }
        genericSurveyFragment.setArguments(bundle);
        return genericSurveyFragment;
    }

    public final GenericSurveyFragment A02(String str, String str2) {
        return A01((Integer) null, str, str2, (String) null);
    }

    public static IgFragmentFactoryImpl A00() {
        IgFragmentFactoryImpl igFragmentFactoryImpl = A00;
        if (igFragmentFactoryImpl != null) {
            return igFragmentFactoryImpl;
        }
        try {
            IgFragmentFactoryImpl igFragmentFactoryImpl2 = (IgFragmentFactoryImpl) Class.forName("com.instagram.util.fragment.IgFragmentFactoryImpl").newInstance();
            A00 = igFragmentFactoryImpl2;
            return igFragmentFactoryImpl2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final F3W A03(String str) {
        F3W f3w = new F3W();
        0qQ.A0B(str, 0);
        f3w.A0B = str;
        return f3w;
    }
}
