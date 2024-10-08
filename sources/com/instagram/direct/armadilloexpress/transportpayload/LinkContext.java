package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C13982TnY;
import X.C66580MXl;
import X.C74232PrL;
import X.NFU;
import X.R33;
import X.R5b;
import X.SQg;
import X.T5L;

public final class LinkContext extends R5b implements C13662TeT {
    public static final LinkContext DEFAULT_INSTANCE;
    public static final int LINK_IMAGE_URL_FIELD_NUMBER = 1;
    public static final int LINK_MUSIC_PREVIEW_COUNTRIES_ALLOWED_FIELD_NUMBER = 6;
    public static final int LINK_MUSIC_PREVIEW_URL_FIELD_NUMBER = 5;
    public static final int LINK_PREVIEW_BODY_FIELD_NUMBER = 8;
    public static final int LINK_PREVIEW_THUMBNAIL_FIELD_NUMBER = 7;
    public static final int LINK_PREVIEW_TITLE_FIELD_NUMBER = 2;
    public static final int LINK_SUMMARY_FIELD_NUMBER = 4;
    public static final int LINK_URL_FIELD_NUMBER = 3;
    public static volatile C74232PrL PARSER;
    public int bitField0_;
    public ImageUrl linkImageUrl_;
    public C13982TnY linkMusicPreviewCountriesAllowed_ = R33.A02;
    public String linkMusicPreviewUrl_ = "";
    public String linkPreviewBody_ = "";
    public Thumbnail linkPreviewThumbnail_;
    public String linkPreviewTitle_ = "";
    public String linkSummary_ = "";
    public String linkUrl_ = "";

    static {
        LinkContext linkContext = new LinkContext();
        DEFAULT_INSTANCE = linkContext;
        R5b.A0B(linkContext, LinkContext.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006\u001a\u0007ဉ\u0005\bဈ\u0006", new Object[]{"bitField0_", "linkImageUrl_", "linkPreviewTitle_", "linkUrl_", "linkSummary_", "linkMusicPreviewUrl_", "linkMusicPreviewCountriesAllowed_", "linkPreviewThumbnail_", "linkPreviewBody_"});
            case 3:
                return new LinkContext();
            case 4:
                return new NFU();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (LinkContext.class) {
                    prL = PARSER;
                    if (prL == null) {
                        SQg sQg = T5L.A01;
                        prL = C66580MXl.A0K(DEFAULT_INSTANCE);
                        PARSER = prL;
                    }
                }
                return prL;
            default:
                throw C66580MXl.A11();
        }
    }
}
