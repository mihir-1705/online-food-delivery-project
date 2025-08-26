package in.mihir.foodiesapi.service;

import in.mihir.foodiesapi.io.CartRequest;
import in.mihir.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
