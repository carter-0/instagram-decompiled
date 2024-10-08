package X;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;

public final class Q6K extends Resources {
    public boolean A00;
    public final Resources A01;
    public final C13582Td8 A02;
    public final Map A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q6K(AssetManager assetManager, Configuration configuration, Resources resources, DisplayMetrics displayMetrics, C13582Td8 td8, Map map) {
        super(assetManager, displayMetrics, configuration);
        DbW.A1O(td8, 2, map);
        this.A01 = resources;
        this.A02 = td8;
        this.A03 = map;
    }

    public final void addLoaders(ResourcesLoader... resourcesLoaderArr) {
        0qQ.A0B(resourcesLoaderArr, 0);
        this.A01.addLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    public final String getQuantityString(int i, int i2, Object... objArr) {
        0qQ.A0B(objArr, 2);
        String quantityString = this.A01.getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        0qQ.A07(quantityString);
        return quantityString;
    }

    public final String getString(int i, Object... objArr) {
        0qQ.A0B(objArr, 1);
        String string = this.A01.getString(i, Arrays.copyOf(objArr, objArr.length));
        0qQ.A07(string);
        return string;
    }

    public final CharSequence getText(int i, CharSequence charSequence) {
        return A00(new GL8(i, 1, this, charSequence), i);
    }

    public final void removeLoaders(ResourcesLoader... resourcesLoaderArr) {
        0qQ.A0B(resourcesLoaderArr, 0);
        this.A01.removeLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    private final CharSequence A00(C62320sa r3, int i) {
        CharSequence AXE;
        String str = (String) C51968G9o.A10(this.A03, i);
        if (str == null || (AXE = this.A02.AXE(str)) == null) {
            return (CharSequence) r3.invoke();
        }
        return AXE;
    }

    public final XmlResourceParser getAnimation(int i) {
        XmlResourceParser animation = this.A01.getAnimation(i);
        0qQ.A07(animation);
        return animation;
    }

    public final boolean getBoolean(int i) {
        return this.A01.getBoolean(i);
    }

    public final int getColor(int i, Resources.Theme theme) {
        return this.A01.getColor(i, theme);
    }

    public final ColorStateList getColorStateList(int i, Resources.Theme theme) {
        ColorStateList colorStateList = this.A01.getColorStateList(i, theme);
        0qQ.A07(colorStateList);
        return colorStateList;
    }

    public final Configuration getConfiguration() {
        Configuration configuration = this.A01.getConfiguration();
        0qQ.A07(configuration);
        return configuration;
    }

    public final float getDimension(int i) {
        return this.A01.getDimension(i);
    }

    public final int getDimensionPixelOffset(int i) {
        return this.A01.getDimensionPixelOffset(i);
    }

    public final int getDimensionPixelSize(int i) {
        return this.A01.getDimensionPixelSize(i);
    }

    public final DisplayMetrics getDisplayMetrics() {
        DisplayMetrics displayMetrics = this.A01.getDisplayMetrics();
        0qQ.A07(displayMetrics);
        return displayMetrics;
    }

    public final Drawable getDrawable(int i, Resources.Theme theme) {
        Drawable drawable = this.A01.getDrawable(i, theme);
        0qQ.A07(drawable);
        return drawable;
    }

    public final Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.A01.getDrawableForDensity(i, i2, theme);
    }

    public final float getFloat(int i) {
        return this.A01.getFloat(i);
    }

    public final Typeface getFont(int i) {
        Typeface font = this.A01.getFont(i);
        0qQ.A07(font);
        return font;
    }

    public final float getFraction(int i, int i2, int i3) {
        return this.A01.getFraction(i, i2, i3);
    }

    public final int getIdentifier(String str, String str2, String str3) {
        return this.A01.getIdentifier(str, str2, str3);
    }

    public final int[] getIntArray(int i) {
        int[] intArray = this.A01.getIntArray(i);
        0qQ.A07(intArray);
        return intArray;
    }

    public final int getInteger(int i) {
        return this.A01.getInteger(i);
    }

    public final XmlResourceParser getLayout(int i) {
        XmlResourceParser layout = this.A01.getLayout(i);
        0qQ.A07(layout);
        return layout;
    }

    public final Movie getMovie(int i) {
        Movie movie = this.A01.getMovie(i);
        0qQ.A07(movie);
        return movie;
    }

    public final CharSequence getQuantityText(int i, int i2) {
        CharSequence quantityText = this.A01.getQuantityText(i, i2);
        0qQ.A07(quantityText);
        return quantityText;
    }

    public final String getResourceEntryName(int i) {
        String resourceEntryName = this.A01.getResourceEntryName(i);
        0qQ.A07(resourceEntryName);
        return resourceEntryName;
    }

    public final String getResourceName(int i) {
        String resourceName = this.A01.getResourceName(i);
        0qQ.A07(resourceName);
        return resourceName;
    }

    public final String getResourcePackageName(int i) {
        String resourcePackageName = this.A01.getResourcePackageName(i);
        0qQ.A07(resourcePackageName);
        return resourcePackageName;
    }

    public final String getResourceTypeName(int i) {
        String resourceTypeName = this.A01.getResourceTypeName(i);
        0qQ.A07(resourceTypeName);
        return resourceTypeName;
    }

    public final String[] getStringArray(int i) {
        String[] stringArray = this.A01.getStringArray(i);
        0qQ.A07(stringArray);
        return stringArray;
    }

    public final CharSequence[] getTextArray(int i) {
        CharSequence[] textArray = this.A01.getTextArray(i);
        0qQ.A07(textArray);
        return textArray;
    }

    public final void getValue(int i, TypedValue typedValue, boolean z) {
        this.A01.getValue(i, typedValue, z);
    }

    public final void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.A01.getValueForDensity(i, i2, typedValue, z);
    }

    public final XmlResourceParser getXml(int i) {
        XmlResourceParser xml = this.A01.getXml(i);
        0qQ.A07(xml);
        return xml;
    }

    public final TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainAttributes = this.A01.obtainAttributes(attributeSet, iArr);
        0qQ.A07(obtainAttributes);
        return obtainAttributes;
    }

    public final TypedArray obtainTypedArray(int i) {
        TypedArray obtainTypedArray = this.A01.obtainTypedArray(i);
        0qQ.A07(obtainTypedArray);
        return obtainTypedArray;
    }

    public final InputStream openRawResource(int i, TypedValue typedValue) {
        InputStream openRawResource = this.A01.openRawResource(i, typedValue);
        0qQ.A07(openRawResource);
        return openRawResource;
    }

    public final AssetFileDescriptor openRawResourceFd(int i) {
        AssetFileDescriptor openRawResourceFd = this.A01.openRawResourceFd(i);
        0qQ.A07(openRawResourceFd);
        return openRawResourceFd;
    }

    public final void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.A01.parseBundleExtra(str, attributeSet, bundle);
    }

    public final void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.A01.parseBundleExtras(xmlResourceParser, bundle);
    }

    public final void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        try {
            this.A01.updateConfiguration(configuration, displayMetrics);
            this.A00 = true;
        } catch (NullPointerException unused) {
            AnonymousClass7TF.A0D().post(new C13029TIl(configuration, displayMetrics, this));
        }
    }

    public final int getColor(int i) {
        return this.A01.getColor(i);
    }

    public final ColorStateList getColorStateList(int i) {
        ColorStateList colorStateList = this.A01.getColorStateList(i);
        0qQ.A07(colorStateList);
        return colorStateList;
    }

    public final Drawable getDrawable(int i) {
        Drawable drawable = this.A01.getDrawable(i);
        0qQ.A07(drawable);
        return drawable;
    }

    public final Drawable getDrawableForDensity(int i, int i2) {
        return this.A01.getDrawableForDensity(i, i2);
    }

    public final String getQuantityString(int i, int i2) {
        String quantityString = this.A01.getQuantityString(i, i2);
        0qQ.A07(quantityString);
        return quantityString;
    }

    public final String getString(int i) {
        return A00(new MJ3(i, 7, this), i).toString();
    }

    public final CharSequence getText(int i) {
        return A00(new MJ3(i, 8, this), i);
    }

    public final void getValue(String str, TypedValue typedValue, boolean z) {
        this.A01.getValue(str, typedValue, z);
    }

    public final InputStream openRawResource(int i) {
        InputStream openRawResource = this.A01.openRawResource(i);
        0qQ.A07(openRawResource);
        return openRawResource;
    }
}
