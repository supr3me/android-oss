package com.kickstarter.services;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kickstarter.libs.FormContents;

import java.util.List;

import okhttp3.OkHttpClient;

public final class KSWebViewClient extends WebViewClient {

  public interface Delegate {
    void webViewOnPageStarted(final @NonNull KSWebViewClient webViewClient, final @Nullable String url);
    void webViewOnPageFinished(final @NonNull KSWebViewClient webViewClient, final @Nullable String url);
    void webViewPageIntercepted(final @NonNull KSWebViewClient webViewClient, final @NonNull String url);
    void webViewExternalLinkActivated(final @NonNull KSWebViewClient webViewClient, final @NonNull String url);
  }

  public KSWebViewClient(final @NonNull OkHttpClient client, final @NonNull String webEndpoint) {
    this(client, webEndpoint, null);
  }

  public KSWebViewClient(final @NonNull OkHttpClient client, final @NonNull String webEndpoint,
    final @Nullable Delegate delegate) {
  }

  public void setDelegate(final @Nullable Delegate delegate) {
  }

  public @Nullable Delegate delegate() {
    return null;
  }

  @Override
  public void onPageStarted(final @Nullable WebView view, final @Nullable String url, final @Nullable Bitmap favicon) {
  }

  @Override
  public void onPageFinished(final @NonNull WebView view, final @NonNull String url) {
  }

  @Override
  public boolean shouldOverrideUrlLoading(final @NonNull WebView view, final @NonNull String url) {
    return false;
  }

  @Override
  public WebResourceResponse shouldInterceptRequest(final @NonNull WebView view, final @NonNull String url) {
    return null;
  }

  // The order of request handlers is important - we iterate through the request handlers
  // sequentially until a match is found.
  public void registerRequestHandlers(final @NonNull List<RequestHandler> requestHandlers) {
  }

  public void setFormContents(final @NonNull FormContents formContents) {
  }
}
